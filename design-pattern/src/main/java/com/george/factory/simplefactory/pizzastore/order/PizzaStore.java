package com.george.factory.simplefactory.pizzastore.order;

/**
 * @ClassName PizzaStore
 * @Description 测试类
 * @Author George
 * @Date 2024/11/4 11:13
 */
// 测试类
public class PizzaStore {
    // 测试披萨订购操作
    public static void main(String[] args) {
//        new OrderPizza();

        //使用简单工厂模式
        new OrderPizza(new PizzaSimpleFactory());
        System.out.println("~~退出程序~~");

//        new OrderPizza2();
    }
}
