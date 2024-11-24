package com.george.iterator.example2;

/**
 * @author George Chan
 * @date 2024/11/24 14:44
 * <p></p>
 */
public class Client {
    public static void main(String[] args) {
        String[] strings = new String[]{"Tom", "Jerry", "Jack", "Marray", "Green"};

        // 创建集合对象,传入数据
        Aggregate aggregate = new ConcreteAggregate(strings);

        // 创建迭代器
        Iterator iterator = aggregate.createIterator();

        // 循环打印元素
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
