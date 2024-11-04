package com.george.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName LDCheesePizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:27
 */
public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
