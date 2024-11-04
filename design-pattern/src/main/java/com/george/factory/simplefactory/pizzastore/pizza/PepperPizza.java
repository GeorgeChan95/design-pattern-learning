package com.george.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName PepperPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 13:40
 */
// 胡椒披萨
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }

}
