package com.etc.vo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;
import java.util.Arrays;

public class From {
    @Length(min =6,max = 8,message = "用户名需要6-8之间")
    private String username;
    @Range(min = 1,max = 120)
    private int age;
    @Pattern(regexp = "[0-9a-zA-Z]{8,}")
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
