package com.george.memento.checkPoints;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        // 发起人
        Originator originator = new Originator();

        // 负责人
        Caretaker caretaker = new Caretaker(originator);

        // 变更状态，并保存检查点
        originator.setState("State 0");
        caretaker.createMemento();

        // 变更状态，并保存检查点
        originator.setState("State 1");
        caretaker.createMemento();

        // 变更状态，并保存检查点
        originator.setState("State 2");
        caretaker.createMemento();

        // 打印当前检查点
        originator.printStates();

        // 恢复到检查点1
        caretaker.restoreMemento(1);

        // 打印当前检查点
        originator.printStates();

        // 恢复到检查点2
        caretaker.restoreMemento(2);

        // 打印当前检查点
        originator.printStates();
    }
}
