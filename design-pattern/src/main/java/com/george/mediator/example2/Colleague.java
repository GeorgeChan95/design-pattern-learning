package com.george.mediator.example2;

/**
 * 抽象的同事类
 */
public abstract class Colleague {
    // 持有一个中介者对象
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 返回当前同事类持有的中介者对象
     * @return
     */
    public Mediator getMediator() {
        return mediator;
    }
}
