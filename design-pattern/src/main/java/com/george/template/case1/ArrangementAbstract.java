package com.george.template.case1;

/**
 * 一日三餐抽象类
 */
public abstract class ArrangementAbstract {
    /**
     * 模板方法
     * 规定了一天的框架
     */
    public void templateMethod() {
        System.out.println("一日安排如下: ");
        getUp();
        breakfast();
        lunch();
        dinner();
        getDown();
    }

    public void getUp() {
        System.out.println("起床");
    }

    public void getDown() {
        System.out.println("睡觉");
    }

    /**
     * 早餐抽象类
     */
    public abstract void breakfast();

    /**
     * 午餐抽象类
     */
    public abstract void lunch();

    /**
     * 晚餐抽象类
     */
    public abstract void dinner();
}
