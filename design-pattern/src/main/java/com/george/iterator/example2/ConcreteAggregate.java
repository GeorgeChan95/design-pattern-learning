package com.george.iterator.example2;

/**
 * @author George Chan
 * @date 2024/11/24 14:05
 * <p></p>
 */

/**
 * 具体聚集类
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    /**
     * 构造方法传入聚集数据
     *
     * @param objArray
     */
    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {

        // 内部索引，记录当前迭代到的索引位置
        private int index = 0;
        // 记录当前聚集对象的大小
        private int size = 0;

        public ConcreteIterator() {
            this.size = objArray.length;
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
            return objArray[index];
        }
    }
}
