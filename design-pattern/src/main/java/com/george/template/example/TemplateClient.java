package com.george.template.example;

/**
 * 模板方法客户端
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
