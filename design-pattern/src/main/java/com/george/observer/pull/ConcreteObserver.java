package com.george.observer.pull;

/**
 * @ClassName ConcreteObserver
 * @Description
 * @Author George
 * @Date 2024/11/25 19:50
 */

/**
 * 具体的观察者
 */
public class ConcreteObserver implements Observer {

    // 观察者的状态
    private String observerState;

    @Override
    public void update(Subject subject) {

        this.observerState = ((ConcreteSubject) subject).getState();
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        System.out.println("观察者的状态更新为：" + this.observerState);
    }
}
