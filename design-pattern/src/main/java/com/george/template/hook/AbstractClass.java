package com.george.template.hook;

/**
 * @ClassName AbstractClass
 * @Description
 * @Author George
 * @Date 2024/11/23 12:27
 */
/**
 * 抽象类, 定义模板
 */
public abstract class AbstractClass {

    /**
     * 定义模板方法
     * 规范了流程的框架
     */
    public void templateMethod() {
        // 调用具体方法
        specificMethod();
        // 钩子方法控制下一步骤
        if (hookMethod()) {
            // 调用抽象方法
            abstractMethod();
        }
    }

    /**
     * 具体方法
     */
    public void specificMethod() {
        // 具体的公共逻辑, 父子类通用
        System.out.println("具体方法---父子类通用逻辑");
    }

    /**
     * 抽象方法
     *
     * 抽象方法, 子类必须重写
     */
    public abstract void abstractMethod();

    /**
     * 钩子方法
     * 钩子方法是有具体实现的,
     */
    public boolean hookMethod() {
        return true;
    }
}
