package com.george.iterator.example1;

/**
 * @author George Chan
 * @date 2024/11/24 14:07
 * <p></p>
 */
public class ConcreteIterator implements Iterator {

    // 持有迭代的具体的聚合对象
    private ConcreteAggregate aggregate = null;
    // 内部索引，记录当前迭代到的索引位置
    private int index = 0;
    // 记录当前聚集对象的大小
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
        this.index = 0;
    }

    /**
     * 迭代方法,移动到第一个元素
     */
    @Override
    public void first() {
        index = 0;
    }

    /**
     * 迭代方法,移动到下一个元素
     */
    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    /**
     * 迭代方法:是否为最后一个元素
     * @return
     */
    @Override
    public boolean isDone() {
        return index >= size;
    }

    /**
     * 迭代方法：返还当前元素
     */
    @Override
    public Object currentItem() {
        return aggregate.getElement(index);
    }
}
