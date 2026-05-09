package com.example.blog.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public class BlogResponse {

    private Integer blogId;

    private String blogTitle;

    private String blogContents;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String authorName;

    private List<TagResponse> tags;

    public BlogResponse() {
    }

    public BlogResponse(
            Integer blogId,
            String blogTitle,
            String blogContents,
            LocalDateTime createTime,
            LocalDateTime updateTime,
            String authorName,
            List<TagResponse> tags
    ) {
        this.blogId = blogId;
        this.blogTitle = blogTitle;
        this.blogContents = blogContents;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.authorName = authorName;
        this.tags = tags;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public String getBlogContents() {
        return blogContents;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public String getAuthorName() {
        return authorName;
    }

    public List<TagResponse> getTags() {
        return tags;
    }
}
