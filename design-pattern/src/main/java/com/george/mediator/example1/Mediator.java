package com.george.mediator.example1;

/**
 * 抽象中介者类
 */
public interface Mediator {
    /**
     * 同事对象在自身改变的时候来通知中介者方法
     * 让中介者去负责相应的与其他同事对象的交互
     */
    void changed(Colleague c);
}
