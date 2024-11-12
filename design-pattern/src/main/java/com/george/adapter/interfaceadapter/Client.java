package com.george.adapter.interfaceadapter;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/12 20:35
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(" === 接口适配器模式 ====");
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };

        absAdapter.m1();
    }
}
