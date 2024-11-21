package com.george.proxy.cglib;

/**
 * @author George Chan
 * @date 2024/11/22 00:14
 * <p></p>
 */

// 测试类
public class Client {

    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();

        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        proxyInstance.teach();
    }
}
