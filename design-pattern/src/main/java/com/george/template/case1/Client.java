package com.george.template.case1;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        ArrangementAbstract arrangementAbstract = new PersonArrangement("张三");
        arrangementAbstract.templateMethod();
    }
}
