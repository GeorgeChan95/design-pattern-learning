package com.george.observer.pull;

/**
 * @ClassName Observer
 * @Description
 * @Author George
 * @Date 2024/11/25 20:12
 */

/**
 * 抽象观察者角色
 */
public interface Observer {

    /**
     * 更新接口
     * @param subject 传入主题对象，方面获取相应的主题对象的状态
     */
    void update(Subject subject);
}
