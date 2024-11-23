package com.george.visitor.example;

/**
 * @ClassName Visitor
 * @Description
 * @Author George
 * @Date 2024/11/23 17:09
 */

/**
 * 抽象访问者对象
 */
public interface Visitor {

    /**
     * 对于具体节点NodeA的访问操作
     * @param nodeA
     */
    void visit(NodeA nodeA);

    /**
     * 对于具体节点NodeB的访问操作
     * @param nodeB
     */
    void visit(NodeB nodeB);
}
