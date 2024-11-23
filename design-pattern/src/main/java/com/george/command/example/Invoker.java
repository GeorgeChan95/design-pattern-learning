package com.george.command.example;

/**
 * 请求者角色
 */
public class Invoker {
    // 聚合抽象命令角色
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 行动方法：调用命令对象执行请求
     */
    public void action() {
        command.execute();
    }
}
