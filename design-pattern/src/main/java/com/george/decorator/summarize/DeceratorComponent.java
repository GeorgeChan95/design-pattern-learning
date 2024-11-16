package com.george.decorator.summarize;

/**
 * @ClassName DeceratorComponent
 * @Description
 * @Author George
 * @Date 2024/11/16 16:24
 */

/**
 * 用来装饰Component对象的类
 */
public abstract class DeceratorComponent implements Component {

    // 指定装饰的对象
    protected Component deceratedComponent;

    public DeceratorComponent(Component deceratedComponent) {
        this.deceratedComponent = deceratedComponent;
    }
}
