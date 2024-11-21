package com.george.proxy.dynamic;


/**
 * @author George Chan
 * @date 2024/11/21 23:24
 * <p></p>
 */
// 被代理的类
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
