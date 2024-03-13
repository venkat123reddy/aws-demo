package com.devops.awsdemo.models;


import lombok.Data;

@Data
public class User {

    public String name;
    public String id;

    public User(String name,String id) {
        this.name = name;
        this.id = id;
    }
}
