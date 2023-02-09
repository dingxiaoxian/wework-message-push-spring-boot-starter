package tech.xiaoxian.wework.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取accessToken请求的返回值
 */
public class AccessTokenVo {
    @JsonProperty("errcode")
    private int errorCode;
    @JsonProperty("errmsg")
    private String errorMessage;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("expires_in")
    private int expiresIn;

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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
/**
 * {
 * "errcode":0,
 * "errmsg":"",
 * "access_token": "accesstoken000001",
 * "expires_in": 7200
 * }
 */
