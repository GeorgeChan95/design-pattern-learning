package com.george.memento.black;


/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        // 发起人对象
        Originator originator = new Originator();

        // 负责人对象
        Caretaker caretaker = new Caretaker();

        // 设置状态
        originator.setState("ON");

        // 创建备忘录
        MementoIF mementoIF = originator.createMemento();
        // 负责人对象保存备忘录
        caretaker.saveMemento(mementoIF);

        // 改变发起人状态
        originator.setState("OFF");

        // 通过备忘录，恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());
    }
}
