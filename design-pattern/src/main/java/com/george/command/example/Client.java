package com.george.command.example;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/23 14:21
 */

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        // 命令接收者
        Receiver receiver = new Receiver();

        // 创建命令对象，将命令接受者设置进去
        Command command = new ConcreteCommand(receiver);

        // 创建请求执行者，并将命令对象设置进去
        Invoker invoker = new Invoker(command);

        // 执行命令
        invoker.action();
    }
}
