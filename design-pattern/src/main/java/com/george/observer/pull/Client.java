package com.george.observer.pull;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/25 20:22
 */
// 测试类
public class Client {
    public static void main(String[] args) {
        // 创建观察者
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        // 创建具体的主题
        ConcreteSubject subject = new ConcreteSubject();
        // 给主题注册观察者
        subject.attach(observer1);
        subject.attach(observer2);
        // 更新主题状态
        subject.change("doWork");

        // 主题移除观察者
        subject.detach(observer2);
        // 更新主题状态
        subject.change("sleep");
    }
}
