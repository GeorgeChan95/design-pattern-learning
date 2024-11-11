package com.george.builder.traditional;

/**
 * @author George Chan
 * @date 2024/11/11 22:07
 * <p></p>
 */
public class HighRises extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
