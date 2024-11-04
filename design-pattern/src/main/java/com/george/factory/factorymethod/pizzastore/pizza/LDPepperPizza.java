package com.george.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName LDPepperPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:27
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
