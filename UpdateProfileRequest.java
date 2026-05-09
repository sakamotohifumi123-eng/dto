package com.example.blog.dto.request;

public class UpdateProfileRequest {

    private String skills;

    private String free;

    private String desired;

    public UpdateProfileRequest() {
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getDesired() {
        return desired;
    }

    public void setDesired(String desired) {
        this.desired = desired;
    }
}
