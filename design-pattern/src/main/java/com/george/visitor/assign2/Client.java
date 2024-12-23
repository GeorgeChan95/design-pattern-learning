package com.george.visitor.assign2;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/23 16:46
 */
public class Client {
    public static void main(String[] args) {
        // 组合1
        East east = new SubEast1();
        West west = new SubWest1();
        east.goEast(west);

        // 组合2
        east = new SubEast2();
        west = new SubWest2();
        east.goEast(west);
    }
}
