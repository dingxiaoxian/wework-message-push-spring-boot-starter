package tech.xiaoxian.wework.message.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 小贤的统一返回值配置
 */
@ConfigurationProperties("wework")
public class WeworkProperties {
    /**
     * 企业id信息
     * <a href="https://developer.work.weixin.qq.com/document/10013">查找文档</a>
     */
    private String corpId;
    /**
     * 应用id信息
     * <a href="https://developer.work.weixin.qq.com/document/path/90226">查找文档</a>
     */
    private Long agentId;
    /**
     * 应用m秘钥信息
     * <a href="https://developer.work.weixin.qq.com/document/path/90226">查找文档</a>
     */
    private String appSecret;

    /**
     * 微信推送消息的api
     * 如果使用代理服务器,则手动填写 如https://xxxxxx
     * 默认为官方url
     */
    private String apiUrl = "https://qyapi.weixin.qq.com";

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}
