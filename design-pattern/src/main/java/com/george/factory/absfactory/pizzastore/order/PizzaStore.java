package com.george.factory.absfactory.pizzastore.order;

/**
 * @ClassName PizzaStore
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 16:16
 */
// 测试类
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
