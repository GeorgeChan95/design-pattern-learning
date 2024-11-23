package com.george.template.example;

/**
 * 具体实现类
 */
public class ConcreteClass extends AbstractClass {

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void abstractMethod() {
        System.out.println("具体实现类--重写父类的抽象方法");
    }
}
