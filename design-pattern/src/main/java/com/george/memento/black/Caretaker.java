package com.george.memento.black;

/**
 * 负责人对象，得到的备忘录对象是以MementoIF为接口的，由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容。
 */
public class Caretaker {
    private MementoIF mementoIF;

    /**
     * 获取备忘录对象
     * @return
     */
    public MementoIF retrieveMemento() {
        return mementoIF;
    }

    /**
     * 备忘录赋值方法
     * @param mementoIF
     */
    public void saveMemento(MementoIF mementoIF) {
        this.mementoIF = mementoIF;
    }

}
