package com.george.factory.absfactory.pizzastore.pizza;

/**
 * @ClassName BJPepperPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:26
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
