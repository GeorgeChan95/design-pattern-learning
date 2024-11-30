package com.george.memento.black;

/**
 * 发起人角色， 定义了一个内部的Memento类。由于此Memento类的全部接口都是私有的，因此只有它自己和发起人类可以调用。
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("发起人当前状态：" + this.state);
    }

    /**
     * 工厂方法，创建一个新的备忘录对象
     * @return
     */
    public MementoIF createMemento() {
        return new Memento(this.state);
    }

    /**
     * 发起人恢复到备忘录对象记录的状态
     */
    public void restoreMemento(MementoIF mementoIF) {
        Memento memento = (Memento) mementoIF;
        this.setState(memento.getState());
    }

    /**
     * 备忘录角色，实现MementoIF接口，作为内部类发起人类可以全部使用其功能接口，其它类只能获得其接口引用
     */
    private class Memento implements MementoIF {
        private String state;

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
