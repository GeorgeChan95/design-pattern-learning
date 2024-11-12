package com.george.adapter.objectadapter;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/12 20:00
 */
// 测试类
public class Client {

    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
