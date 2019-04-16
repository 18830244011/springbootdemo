package com.hxzy.myspringbootdemo.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
@PropertySource(value = "classpath:persion.properties")
@Component
@ConfigurationProperties(prefix = "persion")
public class Persion {
    private String name;
    private int age;
    private Date birthday;

    public Persion(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Persion() {
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public Persion setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Persion setAge(int age) {
        this.age = age;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Persion setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }
}
