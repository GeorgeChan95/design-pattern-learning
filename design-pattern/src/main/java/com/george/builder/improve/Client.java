package com.george.builder.improve;

/**
 * @author George Chan
 * @date 2024/11/11 22:53
 * <p></p>
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector commonDirector = new HouseDirector(new CommonHouse());
        House common = commonDirector.constructHouse();
        System.out.println(common.toString()); // House{baise=5米, wall=0.2米, roofed=普通屋顶}

        HouseDirector highDirector = new HouseDirector(new HighBuilding());
        House high = highDirector.constructHouse();
        System.out.println(high.toString()); // House{baise=30米, wall=2米, roofed=玻璃屋顶}
    }
}
