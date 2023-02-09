package tech.xiaoxian.wework.model.pojo.message;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextMessage {
    @JsonProperty("content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
