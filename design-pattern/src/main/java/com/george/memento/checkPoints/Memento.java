package com.george.memento.checkPoints;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录角色，这个实现可以存储任意多的状态，外界可以使用检查点索引index来取出检查点上的状态。　　
 */
public class Memento {
    private List<String> states;

    private int index;

    public Memento(List<String> states, int index) {
        // states是引用，重新创建新的对象
        this.states = new ArrayList<>(states);
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public int getIndex() {
        return index;
    }
}
