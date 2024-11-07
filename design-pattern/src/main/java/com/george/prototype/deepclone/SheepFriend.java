package com.george.prototype.deepclone;

import java.io.Serializable;

/**
 * @ClassName SheepFriend
 * @Description
 * @Author George
 * @Date 2024/11/7 13:08
 */
public class SheepFriend implements Serializable, Cloneable {
    private String name;
    private int age;
    private String color;

    public SheepFriend(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected SheepFriend clone() {
        SheepFriend friend = null;
        try {
            friend = (SheepFriend) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return friend;
    }
}
