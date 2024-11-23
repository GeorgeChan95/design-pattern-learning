package com.george.visitor.example;

/**
 * @ClassName Client
 * @Description
 * @Author George
 * @Date 2024/11/23 17:25
 */

/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new NodeA());
        //给结构增加一个节点
        os.add(new NodeB());

        Visitor visitor = new VisitorA();
        os.action(visitor);

    }
}
