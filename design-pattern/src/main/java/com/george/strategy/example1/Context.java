package com.george.strategy.example1;

/**
 * 环境角色类
 */
public class Context {

    // 持有一个具体的策略对象
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用策略方法
     */
    public void contextInterface() {
        strategy.strategyInterface();
    }
}
