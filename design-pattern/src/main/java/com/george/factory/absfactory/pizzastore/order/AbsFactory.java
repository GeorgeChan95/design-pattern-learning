package com.george.factory.absfactory.pizzastore.order;

import com.george.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @ClassName AbsFactory
 * @Description
 * @Author George
 * @Date 2024/11/4 16:05
 */
// 定义抽象工厂模式的抽象层（接口）
public interface AbsFactory {

    // 定义生产Pizza的方法，由子类具体实现
    Pizza createPizza(String orderType);
}
