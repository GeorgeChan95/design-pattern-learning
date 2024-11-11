package com.george.builder.improve;

/**
 * @author George Chan
 * @date 2024/11/11 22:47
 * <p></p>
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBaise("30米");
    }

    @Override
    public void buildWalls() {
        house.setWall("2米");
    }

    @Override
    public void roofed() {
        house.setRoofed("玻璃屋顶");
    }
}
