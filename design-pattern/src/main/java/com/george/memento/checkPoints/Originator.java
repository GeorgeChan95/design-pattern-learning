package com.george.memento.checkPoints;

import java.util.ArrayList;
import java.util.List;

/**
 * 发起人角色
 */
public class Originator {
    private List<String> states;

    //检查点指数
    private int index;


    public Originator() {
        this.states = new ArrayList<>();
        this.index = 0;
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(states , index);
    }
    /**
     * 将发起人恢复到备忘录对象记录的状态上
     */
    public void restoreMemento(Memento memento){
        states = memento.getStates();
        index = memento.getIndex();
    }

    /**
     * 状态赋值，更新states和索引
     * @param state
     */
    public void setState(String state) {
        this.states.add(state);
        this.index++;
    }

    /**
     * 打印当前检查点的状态
     */
    public void printStates() {
        System.out.print("发起人检查点索引：" + this.index + "， 状态：");
        for (String state : states) {
            System.out.print(state + " ");
        }
        System.out.println();
    }


}
