package com.george.command.example;

/**
 * @ClassName ConcreteCommand
 * @Description
 * @Author George
 * @Date 2024/11/23 14:17
 */

/**
 * 具体命令角色
 */
public class ConcreteCommand implements Command {
    // 聚合命令接收者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 调用接收者执行具体的方法
        receiver.action();
    }
}
