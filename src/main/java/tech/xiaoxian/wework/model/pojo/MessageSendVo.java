package tech.xiaoxian.wework.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取发送信息请求的返回值
 */
public class MessageSendVo {
    @JsonProperty("errcode")
    private int errorCode;
    @JsonProperty("errmsg")
    private String errorMessage;
    @JsonProperty("invaliduser")
    private String invalidUser;
    @JsonProperty("invalidparty")
    private String invalidParty;
    @JsonProperty("invalidtag")
    private String invalidTag;
    @JsonProperty("unlicenseduser")
    private String unlicensedUser;
    @JsonProperty("msgid")
    private String messageId;
    @JsonProperty("response_code")
    private String responseCode;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getInvalidUser() {
        return invalidUser;
    }

    public void setInvalidUser(String invalidUser) {
        this.invalidUser = invalidUser;
    }

    public String getInvalidParty() {
        return invalidParty;
    }

    public void setInvalidParty(String invalidParty) {
        this.invalidParty = invalidParty;
    }

    public String getInvalidTag() {
        return invalidTag;
    }

    public void setInvalidTag(String invalidTag) {
        this.invalidTag = invalidTag;
    }

    public String getUnlicensedUser() {
        return unlicensedUser;
    }

    public void setUnlicensedUser(String unlicensedUser) {
        this.unlicensedUser = unlicensedUser;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
/**
 * {
 * "errcode":0,
 * "errmsg":"",
 * "invaliduser" : "userid1|userid2",
 * "invalidparty" : "partyid1|partyid2",
 * "invalidtag": "tagid1|tagid2",
 * "unlicenseduser" : "userid3|userid4",
 * "msgid": "xxxx",
 * "response_code": "xyzxyz"
 * }
 */
