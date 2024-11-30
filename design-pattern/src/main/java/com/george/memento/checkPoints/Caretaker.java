package com.george.memento.checkPoints;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人角色
 */
public class Caretaker {
    private Originator originator;
    private List<Memento> mementos;
    private int current;

    public Caretaker(Originator originator) {
        this.originator = originator;
        mementos = new ArrayList<>();
        current = 0;
    }

    /**
     * 创建一个新的检查点
     * @return
     */
    public int createMemento() {
        Memento memento = originator.createMemento();
        mementos.add(memento);
        return current++;
    }

    /**
     * 将发起人恢复到某个检查点
     * @param index
     */
    public void restoreMemento(int index) {
        Memento memento = mementos.get(index);
        originator.restoreMemento(memento);
    }

    /**
     * 删除某个检查点
     * @param index
     */
    public void removeMemento(int index) {
        mementos.remove(index);
    }
}
