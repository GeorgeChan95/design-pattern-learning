package com.george.command.example;

/**
 * 命令接收者
 */
public class Receiver {
    /**
     * 真正执行命令相应的操作
     */
    public void action(){
        System.out.println("==命令接收者执行操作==");
    }
}
