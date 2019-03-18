package com.yanxi.anim.sys.pojo;

public class AnimAttence {
    private String attenceId;

    private String attenceDate;

    private String attenceStart;

    private Integer startStatus;

    private String attenceEnd;

    private Integer endStatus;

    private String username;

    public String getAttenceId() {
        return attenceId;
    }

    public void setAttenceId(String attenceId) {
        this.attenceId = attenceId == null ? null : attenceId.trim();
    }

    public String getAttenceDate() {
        return attenceDate;
    }

    public void setAttenceDate(String attenceDate) {
        this.attenceDate = attenceDate == null ? null : attenceDate.trim();
    }

    public String getAttenceStart() {
        return attenceStart;
    }

    public void setAttenceStart(String attenceStart) {
        this.attenceStart = attenceStart == null ? null : attenceStart.trim();
    }

    public Integer getStartStatus() {
        return startStatus;
    }

    public void setStartStatus(Integer startStatus) {
        this.startStatus = startStatus;
    }

    public String getAttenceEnd() {
        return attenceEnd;
    }

    public void setAttenceEnd(String attenceEnd) {
        this.attenceEnd = attenceEnd == null ? null : attenceEnd.trim();
    }

    public Integer getEndStatus() {
        return endStatus;
    }

    public void setEndStatus(Integer endStatus) {
        this.endStatus = endStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}