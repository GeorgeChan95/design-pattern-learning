package com.george.visitor.assign;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/23 15:55
 */
public class Client {
    public static void main(String[] args) {
        Horse h = new BlackHorse();
        h.eat();
    }
}
