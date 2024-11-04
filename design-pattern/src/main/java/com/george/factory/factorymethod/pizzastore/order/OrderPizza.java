package com.george.factory.factorymethod.pizzastore.order;

import com.george.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:30
 */
public abstract class OrderPizza {

    // 定义成抽象方法，具体如何制作pizza由子类实现
    abstract Pizza createPizza(String orderType);

    /**
     * 父类无参构造器
     * 当父类被子类继承后，自己调用子类的无参构造前，会先调用父类的无参构造
     */
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象方法，由工厂子类完成
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
