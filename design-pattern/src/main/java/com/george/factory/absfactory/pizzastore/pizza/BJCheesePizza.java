package com.george.factory.absfactory.pizzastore.pizza;

/**
 * @ClassName BJCheesePizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:26
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
