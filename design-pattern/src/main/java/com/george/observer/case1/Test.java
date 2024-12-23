package com.george.observer.case1;

import java.util.Observer;

/**
 * @ClassName Test
 * @Description
 * @Author George
 * @Date 2024/11/25 20:36
 */
// 测试类
public class Test {
    public static void main(String[] args) {

        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }
}
