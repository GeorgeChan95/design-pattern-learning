package com.george.uml.test;

/**
 * @author George Chan
 * @date 2024/11/3 14:57
 * <p></p>
 */
public class Person {
    public String name;

    protected int age;

    private String accommodation = "Earth";//住所

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

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }
}