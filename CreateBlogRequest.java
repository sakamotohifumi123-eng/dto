package com.example.blog.dto.request;

import java.util.List;

public class CreateBlogRequest {

    private String blogTitle;

    private String blogContents;

    private List<String> tags;

    public CreateBlogRequest() {
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContents() {
        return blogContents;
    }

    public void setBlogContents(String blogContents) {
        this.blogContents = blogContents;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
