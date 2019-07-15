package com.etc.vo;

import java.util.Arrays;

public class From {
    private String username;
    private int age;
    private String password;
    private String[] aihao;
    private String home;

    @Override
    public String toString() {
        return "From{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", aihao=" + Arrays.toString(aihao) +
                ", home='" + home + '\'' +
                '}';
    }

    public From() {
    }

    public From(String username, int age, String password, String[] aihao, String home) {
        this.username = username;
        this.age = age;
        this.password = password;
        this.aihao = aihao;
        this.home = home;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getAihao() {
        return aihao;
    }

    public void setAihao(String[] aihao) {
        this.aihao = aihao;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
