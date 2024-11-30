package com.george.memento.white;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        // 发起人角色
        Originator originator = new Originator();

        // 负责人角色
        Caretaker caretaker = new Caretaker();
        // 设置状态
        originator.setState("ON");

        // 创建一个备忘录对象，并使用负责人对象保存
        caretaker.saveMemento(originator.createMemento());

        // 修改发起人状态
        originator.setState("OFF");

        // 恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());

        System.out.println("发起人状态恢复到：" + originator.getState());
    }

}
