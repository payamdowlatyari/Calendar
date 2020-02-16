//Payam Dowlatyari
//UserBuilder
package com.calendar;

public class UserBuilder {//Applying the design pattern Builder
    private String username;
    private Setting setting;

    public UserBuilder setUsername(String username){
        this.username = username;
        return this;
    }

    public UserBuilder setSettings(Setting setting){
        this.setting = setting;
        return this;
    }

    public User getUser(){
        return new User(username, setting);
    }
}
