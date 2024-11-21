package com.george.proxy.staticproxy;

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
}
