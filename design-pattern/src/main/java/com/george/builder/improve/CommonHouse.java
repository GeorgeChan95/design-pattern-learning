package com.george.builder.improve;

/**
 * @author George Chan
 * @date 2024/11/11 22:46
 * <p></p>
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBaise("5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("0.2米");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通屋顶");
    }
}
