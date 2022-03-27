package com.gongbing.entity;

import lombok.Data;

// 实体类
@Data
public class User {
    private int id;
    private String name;
    private String pwd;

    public User(){};

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
