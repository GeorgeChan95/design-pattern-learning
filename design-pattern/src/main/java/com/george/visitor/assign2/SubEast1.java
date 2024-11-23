package com.george.visitor.assign2;

/**
 * @ClassName SubEast1
 * @Description
 * @Author George
 * @Date 2024/11/23 16:39
 */
public class SubEast1 extends East {
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }

    public String myName1(){
        return "SubEast1";
    }
}
