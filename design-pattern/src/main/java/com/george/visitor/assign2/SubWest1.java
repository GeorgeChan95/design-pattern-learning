package com.george.visitor.assign2;

/**
 * @ClassName SubWest1
 * @Description
 * @Author George
 * @Date 2024/11/23 16:38
 */
public class SubWest1 extends West {
    @Override
    public void goWest1(SubEast1 east) {
        System.out.println("SubWest1 + " + east.myName1());
    }

    @Override
    public void goWest2(SubEast2 east) {
        System.out.println("SubWest1 + " + east.myName2());
    }
}
