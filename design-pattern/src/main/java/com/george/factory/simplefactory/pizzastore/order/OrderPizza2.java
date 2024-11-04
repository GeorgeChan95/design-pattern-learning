package com.george.factory.simplefactory.pizzastore.order;

import com.george.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza2
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 14:49
 */
// 使用静态工厂模式创建对象
public class OrderPizza2 {
    /**
     * 使用静态工厂模式构建Pizza对象
     */
    public OrderPizza2() {

        String orderType = ""; //用户输入要制作的Pizza类型
        Pizza pizza = null;
        do {
            orderType = getType();
            // 使用披萨工厂对象创建披萨
            pizza = PizzaSimpleFactory.createPizza2(orderType);

            //输出pizza
            if(pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }


    // 写一个方法，获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
