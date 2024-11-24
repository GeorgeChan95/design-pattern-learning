package com.george.iterator.example1;

/**
 * @author George Chan
 * @date 2024/11/24 14:15
 * <p></p>
 */
public class Client {
    public static void main(String[] args) {
        String[] strings = new String[]{"Tom", "Jerry", "Jack", "Marray", "Green"};
        // 创建聚合角色
        Aggregate aggregate = new ConcreteAggregate(strings);

        // 创建迭代器
        Iterator iterator = aggregate.createIterator();

        while (!iterator.isDone()) {
            String name = (String) iterator.currentItem();
            System.out.println(name);

            iterator.next();
        }
    }
}
