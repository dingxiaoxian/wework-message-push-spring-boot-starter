package tech.xiaoxian.wework.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import tech.xiaoxian.wework.model.pojo.message.TextMessage;

/**
 * 请求发送消息的对象
 */
public class MessageSendRo {
    @JsonProperty("touser")
    private String toUser;
    @JsonProperty("toparty")
    private String toParty;
    @JsonProperty("totag")
    private String toTag;
    @JsonProperty("msgtype")
    private String messageType;
    @JsonProperty("agentid")
    private long agentId;
    @JsonProperty("text")
    private TextMessage text;
    @JsonProperty("safe")
    private Integer safe;
    @JsonProperty("enable_id_trans")
    private Integer enable_id_trans;
    @JsonProperty("enable_duplicate_check")
    private Integer enable_duplicate_check;
    @JsonProperty("duplicate_check_interval")
    private Integer duplicate_check_interval;

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getToParty() {
        return toParty;
    }

    public void setToParty(String toParty) {
        this.toParty = toParty;
    }

    public String getToTag() {
        return toTag;
    }

    public void setToTag(String toTag) {
        this.toTag = toTag;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }

    public TextMessage getText() {
        return text;
    }

    public void setText(TextMessage text) {
        this.text = text;
    }

    public Integer getSafe() {
        return safe;
    }

    public void setSafe(Integer safe) {
        this.safe = safe;
    }

    public Integer getEnable_id_trans() {
        return enable_id_trans;
    }

    public void setEnable_id_trans(Integer enable_id_trans) {
        this.enable_id_trans = enable_id_trans;
    }

    public Integer getEnable_duplicate_check() {
        return enable_duplicate_check;
    }

    public void setEnable_duplicate_check(Integer enable_duplicate_check) {
        this.enable_duplicate_check = enable_duplicate_check;
    }

    public Integer getDuplicate_check_interval() {
        return duplicate_check_interval;
    }

    public void setDuplicate_check_interval(Integer duplicate_check_interval) {
        this.duplicate_check_interval = duplicate_check_interval;
    }
}

/**
 * {
 * "touser": "terryding77",
 * "toparty": "",
 * "totag": "",
 * "msgtype": "text",
 * "agentid": 1000002,
 * "text": {
 * "content": "你的快递已到，请携带工卡前往邮件中心领取。\n出发前可查看<a href=\"http://work.weixin.qq.com\">邮件中心视频实况</a>，聪明避开排队。"
 * },
 * "safe": 0,
 * "enable_id_trans": 0,
 * "enable_duplicate_check": 0
 * }
 */