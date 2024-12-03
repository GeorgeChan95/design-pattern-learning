package com.george.responsibilitychain.example1;

/**
 * 抽象处理者角色
 */
public abstract class Handler {

    // 持有后继的责任对象
    private Handler successor;

    /**
     * 处理请求方法的示例，这里没有传参，实际上可根据需要传参
     */
    public abstract void handleRequest();

    /**
     * 获取后继责任对象
     * @return
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 设置后继责任对象
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
