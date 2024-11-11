package com.george.builder.traditional;

/**
 * @author George Chan
 * @date 2024/11/11 22:05
 * <p></p>
 */
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("普通房屋打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房屋砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房屋封顶");
    }
}
