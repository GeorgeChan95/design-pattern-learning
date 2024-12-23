package com.george.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName Pizza
 * @Description
 * @Author George
 * @Date 2024/11/4 11:09
 */

// 将Pizza 类做成抽象
public abstract class Pizza {
    protected String name; //名字

    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    // 烘培
    public void bake() {
        System.out.println(name + " baking;");
    }

    // 裁切
    public void cut() {
        System.out.println(name + " cutting;");
    }

    // 打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
