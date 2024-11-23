package com.george.template.example;

/**
 * 抽象类, 定义模板
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     * 规范了流程的框架
     */
    public void templateMethod() {
        // 先调用具体方法
        specificMethod();
        // 在调用抽象方法
        abstractMethod();
    }

    public void specificMethod() {
        // 具体的公共逻辑, 父子类通用
        System.out.println("具体方法---父子类通用逻辑");
    }

    /**
     * 抽象方法
     * 抽象方法, 子类必须重写
     */
    public abstract void abstractMethod();
}
