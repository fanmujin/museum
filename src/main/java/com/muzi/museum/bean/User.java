package com.muzi.museum.bean;

public class User {
    String name;
    String password;
    public User(String n,String p){
        setName(n);
        setPassword(p);
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
}
