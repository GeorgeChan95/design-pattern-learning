package com.george.memento.historySelf;

/**
 * 发起人角色同时还兼任负责人角色，也就是说它自己负责保持自己的备忘录对象。
 */
public class Originator {
    public String state;

    /**
     * 改变状态
     * @param state
     */
    public void changeState(String state) {
        this.state = state;
        System.out.println("状态改变为：" + state);
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public MementoIF createMemento() {
        return new Memento(this);
    }

    /**
     * 将发起人恢复到备忘录对象所记录的状态上
     */
    public void restoreMemento(MementoIF mementoIF) {
        Memento memento = (Memento) mementoIF;
        changeState(memento.getState());
    }

    public String getState() {
        return state;
    }

    /**
     * 备忘录角色，作为内部类
     */
    private class Memento implements MementoIF {
        private String state;

        /**
         * 构造方法
         * @param originator
         */
        public Memento(Originator originator) {
            this.state = originator.getState();
        }

        public String getState() {
            return state;
        }
    }
}
