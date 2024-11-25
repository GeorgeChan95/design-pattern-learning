package com.george.observer.case1;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Watcher
 * @Description
 * @Author George
 * @Date 2024/11/25 20:33
 */
// 观察者角色
public class Watcher implements Observer {

    public Watcher(Observable observable) {
        // 添加观察者到主题中
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("主题状态发生改变：" + ((Watched)o).getData());
    }
}
