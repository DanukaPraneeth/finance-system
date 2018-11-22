package com.backend.core.users;

public class Staff {

    private int userKey;
    private String name;
    private String password;
    private String saltValue;
    private int role;

    public Staff(int userKey, String name, String password, String saltValue, int role) {
        this.userKey = userKey;
        this.name = name;
        this.password = password;
        this.saltValue = saltValue;
        this.role = role;
    }

    public int getUserKey() {
        return userKey;
    }

    public void setUserKey(int userKey) {
        this.userKey = userKey;
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

    public String getSaltValue() {
        return saltValue;
    }

    public void setSaltValue(String saltValue) {
        this.saltValue = saltValue;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
