package com.george.builder.improve;

/**
 * @author George Chan
 * @date 2024/11/11 22:40
 * <p></p>
 */
//产品->Product
public class House {
    // 地基
    private String baise;

    // 墙
    private String wall;

    // 屋顶
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" + "baise=" + baise + ", wall=" + wall + ", roofed=" + roofed + "}";
    }
}
