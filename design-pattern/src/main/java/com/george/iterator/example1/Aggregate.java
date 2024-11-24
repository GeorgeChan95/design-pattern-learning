package com.george.iterator.example1;

/**
 * @author George Chan
 * @date 2024/11/24 14:01
 * <p></p>
 */

/**
 * 抽象聚集类
 */
public abstract class Aggregate {

    /**
     * 工厂方法, 创建相应的迭代器对象接口
     *
     * @return
     */
    public abstract Iterator createIterator();
}