package com.george.facade.pattern2;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/20 20:05
 */
// 测试类
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
