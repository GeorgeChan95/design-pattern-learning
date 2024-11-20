package com.george.facade.pattern3;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/20 20:29
 */
// 测试类
public class Client {
    public static void main(String[] args) {
        Facade facade1 = new FacadeImplA();
        facade1.method();

        Facade facade2 = new FacadeImplB();
        facade2.method();
    }
}
