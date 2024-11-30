package com.george.memento.white;

/**
 * 发起人角色类，利用备忘录角色对象存储自身的状态
 */
public class Originator {

    private String state;

    /**
     * 工厂方法，创建一个新的备忘录对象
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 通过备忘录对象，将发起人状态恢复到备忘录记载的状态
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("发起人当前状态：" + this.state);
    }
}
