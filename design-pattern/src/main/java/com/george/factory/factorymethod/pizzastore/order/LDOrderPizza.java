package com.george.factory.factorymethod.pizzastore.order;

import com.george.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.george.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.george.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @ClassName LDOrderPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:39
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
