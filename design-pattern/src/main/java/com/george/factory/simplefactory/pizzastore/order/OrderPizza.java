package com.george.factory.simplefactory.pizzastore.order;

import com.george.factory.simplefactory.pizzastore.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 11:12
 */
// 订购披萨
public class OrderPizza {
    // 构造器
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType; // 订购披萨的类型
//		do {
//			orderType = getType();
//			if (orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName(" 希腊披萨 ");
//			} else if (orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName(" 奶酪披萨 ");
//			} else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披萨");
//			} else {
//				break;
//			}
//			//输出pizza 制作过程
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//
//		} while (true);
//	}

	// 披萨工厂
	private PizzaSimpleFactory pizzaFactory;

	/**
	 * 使用简单工厂模式构建Pizza对象
	 * @param simpleFactory
	 */
	public OrderPizza(PizzaSimpleFactory simpleFactory) {
		// 设置披萨工厂
		setFactory(simpleFactory);

		String orderType = ""; //用户输入要制作的Pizza类型
		Pizza pizza = null;
		do {
			orderType = getType();
			// 使用披萨工厂对象创建披萨
			pizza = this.pizzaFactory.createPizza(orderType);

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

	// 设置pizza工厂
	private void setFactory(PizzaSimpleFactory simpleFactory) {
		this.pizzaFactory = simpleFactory;
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
