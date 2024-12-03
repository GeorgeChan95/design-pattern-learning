package com.george.responsibilitychain.example1;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 创建责任链上的具体处理者对象
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();

        // 组装责任链
        handler1.setSuccessor(handler2);

        // 处理请求
        handler1.handleRequest();
    }
}
