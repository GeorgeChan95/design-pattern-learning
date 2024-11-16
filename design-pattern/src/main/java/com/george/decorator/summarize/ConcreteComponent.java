package com.george.decorator.summarize;

/**
 * @ClassName ConcreteComponent
 * @Description
 * @Author George
 * @Date 2024/11/16 16:24
 */
/**
 * 具体功能实现
 */
public class ConcreteComponent implements Component{
    @Override
    public void operate() {
        // 实现具体的逻辑
        System.out.println("具体实现的逻辑");
    }
}
