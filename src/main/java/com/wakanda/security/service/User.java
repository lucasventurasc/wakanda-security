package com.wakanda.security.service;

public class User {

    private String name;
    private String password;
    private String email;
    private String tokenActual;
    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTokenActual() {
        return tokenActual;
    }

    public void setTokenActual(String tokenActual) {
        this.tokenActual = tokenActual;
    }
}
