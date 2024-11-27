package com.george.mediator.example1;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    // 持有一个中介者对象
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 获取当前同事类对应的中介者对象
     * @return
     */
    public Mediator getMediator() {
        return mediator;
    }
}
