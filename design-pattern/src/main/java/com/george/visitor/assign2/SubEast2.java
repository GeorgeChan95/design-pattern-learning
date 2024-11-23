package com.george.visitor.assign2;

/**
 * @ClassName SubEast1
 * @Description
 * @Author George
 * @Date 2024/11/23 16:39
 */
public class SubEast2 extends East {
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }

    public String myName2(){
        return "SubEast2";
    }
}
