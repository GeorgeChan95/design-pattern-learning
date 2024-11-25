package com.george.observer.push;

/**
 * @ClassName Observer
 * @Description
 * @Author George
 * @Date 2024/11/25 19:50
 */

/**
 * 抽象观察者
 */
public interface Observer {

    /**
     * 观察者更新接口
     * @param newState
     */
    void update(String newState);
}
