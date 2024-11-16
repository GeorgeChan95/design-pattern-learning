package com.george.decorator.summarize;

/**
 * @ClassName DeceratorTest
 * @Description
 * @Author George
 * @Date 2024/11/16 16:28
 */
public class DeceratorTest {
    public static void main(String[] args) {
        Component concreteCom = new ConcreteComponent();
        concreteCom.operate();

        System.out.println("============");
        DeceratorComponent decerator = new ConcreteDeceratorComponent(new ConcreteComponent());
        decerator.operate();
    }
}
