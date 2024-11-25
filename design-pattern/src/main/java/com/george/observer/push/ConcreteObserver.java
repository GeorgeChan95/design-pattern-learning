package com.george.observer.push;

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
    public void update(String newState) {
        this.observerState = newState;
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        System.out.println("观察者的状态更新为：" + this.observerState);
    }
}
