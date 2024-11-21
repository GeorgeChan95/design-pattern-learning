package com.george.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author George Chan
 * @date 2024/11/22 00:09
 * <p></p>
 */
// Cglib代理类
public class ProxyFactory implements MethodInterceptor {

    private TeacherDao target;

    public ProxyFactory(TeacherDao target) {
        this.target = target;
    }

    //返回一个代理对象:  是 target 对象的代理对象
    public Object getProxyInstance() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写  intercept 方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式 ~~ 开始");
        Object resultVal = method.invoke(target, args);
        System.out.println("Cglib代理模式 ~~ 提交");
        return resultVal;
    }
}
