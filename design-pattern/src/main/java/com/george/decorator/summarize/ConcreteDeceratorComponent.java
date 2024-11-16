package com.george.decorator.summarize;

/**
 * @ClassName ConcreteDeceratorComponent
 * @Description
 * @Author George
 * @Date 2024/11/16 16:27
 */

/**
 * 具体的装饰类
 */
public class ConcreteDeceratorComponent extends DeceratorComponent {

    public ConcreteDeceratorComponent(Component deceratedComponent) {
        super(deceratedComponent);
    }

    @Override
    public void operate() {
        before();
        super.deceratedComponent.operate();
        after();
    }

    public void before(){
        System.out.println("在原逻辑之前增加了逻辑");
    }

    public void after(){
        System.out.println("在原逻辑之后增加了逻辑");
    }
}
