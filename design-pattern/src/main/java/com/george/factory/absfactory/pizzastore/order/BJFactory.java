package com.george.factory.absfactory.pizzastore.order;

import com.george.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.george.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.george.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @ClassName BJFactory
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 16:07
 */
// 工厂子类，继承抽象工厂，实现生产实例的方法
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
