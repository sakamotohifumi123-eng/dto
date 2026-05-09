package com.example.blog.dto.response;

public class ProfileResponse {

    private String name;

    private String mailAddress;

    private String skills;

    private String free;

    private String desired;

    private String projectName;

    private String rankName;

    public ProfileResponse() {
    }

    public ProfileResponse(
            String name,
            String mailAddress,
            String skills,
            String free,
            String desired,
            String projectName,
            String rankName
    ) {
        this.name = name;
        this.mailAddress = mailAddress;
        this.skills = skills;
        this.free = free;
        this.desired = desired;
        this.projectName = projectName;
        this.rankName = rankName;
    }

    public String getName() {
        return name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getSkills() {
        return skills;
    }

    public String getFree() {
        return free;
    }

    public String getDesired() {
        return desired;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getRankName() {
        return rankName;
    }
}
