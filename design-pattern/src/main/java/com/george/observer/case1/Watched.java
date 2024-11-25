package com.george.observer.case1;

import java.util.Observable;

/**
 * 主题角色
 */
public class Watched extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!data.equals(this.data)) {
            this.data = data;
            // 调用父类方法，更新 changed标识
            setChanged();
        }
        // 调用父类方法， 更新观察者
        notifyObservers();
    }
}
