package com.george.builder.improve;

/**
 * @author George Chan
 * @date 2024/11/11 22:45
 * <p></p>
 */
// 抽象构建者
public abstract class HouseBuilder {
    // 聚合产品
    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
