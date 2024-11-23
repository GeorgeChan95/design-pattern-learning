package com.george.template.hook;

/**
 * @ClassName TemplateClient
 * @Description
 * @Author George
 * @Date 2024/11/23 12:43
 */

/**
 * 测试类
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
