package com.george.memento.historySelf;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 发起人
        Originator originator = new Originator();
        // 改变状态
        originator.changeState("ON");

        // 存储发起人状态
        MementoIF memento = originator.createMemento();

        // 改变状态
        originator.changeState("OFF");

        // 恢复发起人状态
        originator.restoreMemento(memento);
    }
}
