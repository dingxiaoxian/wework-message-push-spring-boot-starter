package tech.xiaoxian.wework.message.configure;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.xiaoxian.wework.message.WeworkTool;

/**
 * 统一返回值自动配置类
 */
@Configuration
@EnableConfigurationProperties(WeworkProperties.class)
public class WeworkAutoConfigure {
    @Bean
    @ConditionalOnMissingBean
    WeworkTool WeworkTool(WeworkProperties weworkProperties, ObjectMapper objectMapper) {
        return new WeworkTool(weworkProperties, objectMapper);
    }
}
