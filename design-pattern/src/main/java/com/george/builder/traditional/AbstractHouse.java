package com.george.builder.traditional;

/**
 * @author George Chan
 * @date 2024/11/11 22:04
 * <p></p>
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    /**
     * 构建方法
     */
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
