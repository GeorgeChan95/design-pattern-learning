package com.george.responsibilitychain.example1;

/**
 * 具体处理者角色
 */
public class ConcreteHandler extends Handler {

    /**
     * 请求处理方法
     */
    @Override
    public void handleRequest() {
        if (getSuccessor() != null) { // 如果有后继处理者
            System.out.println("放过请求");
            // 调用后继处理者，处理请求
            getSuccessor().handleRequest();
        } else { // 自己处理请求
            System.out.println("处理请求");
        }
    }
}
