package com.george.visitor.example;

/**
 * @ClassName Node
 * @Description
 * @Author George
 * @Date 2024/11/23 17:10
 */

/**
 * 抽象节点类
 */
public abstract class Node {

    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
