package com.george.visitor.example;

/**
 * @ClassName VisitorA
 * @Description
 * @Author George
 * @Date 2024/11/23 17:18
 */

/**
 * 具体的访问者A类
 */
public class VisitorA implements Visitor {

    @Override
    public void visit(NodeA nodeA) {
        System.out.println(nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println(nodeB.operationB());
    }
}
