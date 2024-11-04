package com.george.factory.factorymethod.pizzastore.order;

import com.george.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.george.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.george.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @ClassName BJOrderPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:33
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
