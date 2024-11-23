package com.george.template.case1;

/**
 * 张三的一日三餐安排
 */
public class PersonArrangement extends ArrangementAbstract {
    private String name;

    public PersonArrangement(String name) {
        this.name = name;
    }

    /**
     * 早餐抽象类
     */
    public void breakfast() {
        System.out.println(name + "--早餐吃牛奶面包");
    }

    /**
     * 午餐抽象类
     */
    public void lunch() {
        System.out.println(name + "--中餐吃食堂");
    }

    /**
     * 晚餐抽象类
     */
    public void dinner() {
        System.out.println(name + "--晚餐吃水果");
    }
}