package com.george.proxy.staticproxy;

/**
 * @author George Chan
 * @date 2024/11/21 23:25
 * <p></p>
 */
//代理对象,静态代理
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        this.before();
        target.teach();
        this.after();
    }

    public void before() {
        System.out.println("准备课程");
    }

    public void after() {
        System.out.println("结束课程");
    }
}
