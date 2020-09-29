package com.meng.springboot.sallary.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String sallary;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sallary='" + sallary + '\'' +
                '}';
    }
}
