package com.george.factory.simplefactory.pizzastore.order;

import com.george.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.george.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.george.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.george.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @ClassName PizzaSimpleFactory
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 14:31
 */
// 简单工厂模式
public class PizzaSimpleFactory {

    /**
     * 简单工厂模式，创建Pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    /**
     * 使用静态工厂模式创建Pizza对象
     * @param orderType 用户输入的Pizza类型
     * @return
     */
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;

        System.out.println("使用静态工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
