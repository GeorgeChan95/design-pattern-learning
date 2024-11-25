package com.george.observer.push;

/**
 * @ClassName ConcreteSubject
 * @Description
 * @Author George
 * @Date 2024/11/25 19:56
 */

/**
 * 具体的观察者对象
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    /**
     * 主题状态更新方法
     * @param newState 新状态
     */
    public void change(String newState) {
        this.state = newState;
        System.out.println("主题状态为：" + state);
        //状态发生改变，通知各个观察者
        super.notifyObservers(newState);
    }
}