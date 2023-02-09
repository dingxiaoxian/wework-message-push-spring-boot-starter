package tech.xiaoxian.wework.message;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import tech.xiaoxian.wework.message.configure.WeworkProperties;
import tech.xiaoxian.wework.model.pojo.AccessTokenVo;
import tech.xiaoxian.wework.model.pojo.MessageSendRo;
import tech.xiaoxian.wework.model.pojo.MessageSendVo;
import tech.xiaoxian.wework.model.pojo.message.TextMessage;

import java.time.Instant;
import java.util.List;


/**
 * 抽象的全局异常处理切面
 */
public class WeworkTool {
    private WeworkProperties properties;

    private WebClient webClient;
    private String accessToken;
    private Instant accessTokenValidTime;
    /**
     * log对象
     */
    protected Logger logger = LoggerFactory.getLogger(WeworkTool.class);

    public WeworkTool(WeworkProperties weworkProperties, ObjectMapper objectMapper) {
        ObjectMapper newMapper = objectMapper.copy();
        newMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);

        properties = weworkProperties;
        webClient = WebClient.builder()
                .codecs(configurer ->
                        configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(newMapper))
                )
                .baseUrl(properties.getApiUrl())
                .build();
    }

    private String getAccessToken() {
        refreshToken(false);
        if (accessToken == null) {
            refreshToken(true);
        }
        return accessToken;
    }

    private void refreshToken(boolean force) {
        if (!force
                && accessTokenValidTime != null
                && accessTokenValidTime.isAfter(Instant.now())
        ) {
            return;
        }
        AccessTokenVo vo = webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/cgi-bin/gettoken")
                        .queryParam("corpid", properties.getCorpId())
                        .queryParam("corpsecret", properties.getAppSecret())
                        .build()
                )
                .retrieve()
                .bodyToMono(AccessTokenVo.class)
                .block();
        if (vo != null && vo.getAccessToken() != null) {
            accessToken = vo.getAccessToken();
            // 减半时间进行
            accessTokenValidTime = Instant.now().plusSeconds(vo.getExpiresIn() / 2);
        }
    }

    public String setTextMessageToUsers(String text, List<String> userIds) {
        TextMessage textMessage = new TextMessage();
        textMessage.setContent(text);
        MessageSendRo message = new MessageSendRo();
        message.setText(textMessage);
        message.setToUser(String.join("|", userIds));
        message.setMessageType("text");
        if (properties.getAgentId() == null) {
            return null;
        }
        message.setAgentId(properties.getAgentId());
        return sendMessage(message);
    }

    public String sendMessage(MessageSendRo message) {
        MessageSendVo vo = webClient
                .post()
                .uri(uriBuilder -> uriBuilder
                        .path("/cgi-bin/message/send")
                        .queryParam("access_token", getAccessToken())
                        .build()
                )
                .body(BodyInserters.fromValue(message))
                .retrieve()
                .bodyToMono(MessageSendVo.class)
                .block();
        if (vo == null) {
            return null;
        }
        return vo.getMessageId();
    }
}
