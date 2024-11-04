package com.george.factory.absfactory.pizzastore.pizza;

/**
 * @ClassName Pizza
 * @Description TODO
 * @Author George
 * @Date 2024/11/4 15:17
 */
//将Pizza 类做成抽象
public abstract class Pizza {
    protected String name; //名字

    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();


    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}