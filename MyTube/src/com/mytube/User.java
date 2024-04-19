package com.mytube;

public class User {

    private String email;
    private int contact;

    public User(String email) {
        this.email = email;
    }

    public User(int contact) {
        this.contact = contact;
    }

    public User(String email, int contact) {
        this.contact = contact;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

}