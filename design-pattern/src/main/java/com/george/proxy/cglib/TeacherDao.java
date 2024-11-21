package com.george.proxy.cglib;

/**
 * @author George Chan
 * @date 2024/11/22 00:09
 * <p></p>
 */
// 目标代理的对象
public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }
}
