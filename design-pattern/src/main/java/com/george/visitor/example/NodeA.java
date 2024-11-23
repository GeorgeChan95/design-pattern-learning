package com.george.visitor.example;

/**
 * @ClassName NodeA
 * @Description
 * @Author George
 * @Date 2024/11/23 17:15
 */

/**
 * 具体节点类A
 */
public class NodeA extends Node {

    /**
     * 接受操作
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }
}
