package com.george.factory.absfactory.pizzastore.order;

import com.george.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 16:10
 */
public class OrderPizza {

    private AbsFactory factory;

    // 构造器传参，设置生产对象的具体工厂子类
    public OrderPizza(AbsFactory factory) {
        this.factory = factory;
        // 生产Pizza
        createPizza();
    }

    /**
     * 生产pizza方法
     * @return
     */
    private void createPizza() {
        Pizza pizza = null;
        String orderType = ""; // 用户输入
        do {
            orderType = getType();
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = this.factory.createPizza(orderType);
            if (pizza != null) { // 订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
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
