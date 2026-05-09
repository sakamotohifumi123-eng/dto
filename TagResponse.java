package com.example.blog.dto.response;

public class TagResponse {

    private Integer tagId;

    private String tagName;

    public TagResponse() {
    }

    public TagResponse(Integer tagId, String tagName) {
        this.tagId = tagId;
        this.tagName = tagName;
    }

    public Integer getTagId() {
        return tagId;
    }

    public String getTagName() {
        return tagName;
    }
}
