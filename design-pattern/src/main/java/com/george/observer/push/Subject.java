package com.george.observer.push;

/**
 * @ClassName Subject
 * @Description
 * @Author George
 * @Date 2024/11/25 19:49
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色
 */
public abstract class Subject {
    /**
     * 保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者
     * @param observer
     */
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("注册了一个观察者对象");
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有的观察者对象
     * @param newState
     */
    public void notifyObservers(String newState) {
        for (Observer observer : list) {
            observer.update(newState);
        }
    }
}
