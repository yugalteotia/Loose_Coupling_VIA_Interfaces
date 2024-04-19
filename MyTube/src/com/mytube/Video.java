package com.mytube;

public class Video {
    private String fileName;
    private String title;
    private User user;

    public Video() {
    }

    public Video(String fileName, String title, User user) {
        this.fileName = fileName;
        this.title = title;
        this.user = user;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}