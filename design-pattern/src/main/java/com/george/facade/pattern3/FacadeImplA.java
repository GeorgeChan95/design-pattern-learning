package com.george.facade.pattern3;

/**
 * @ClassName FacadeImpl
 * @Description
 * @Author George
 * @Date 2024/11/20 20:23
 */
// 具体外观类A
public class FacadeImplA implements Facade {

    SubSystem1 subSystem1 = null;
    SubSystem2 subSystem2 = null;
    SubSystem3 subSystem3 = null;

    public FacadeImplA() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
    }

    @Override
    public void method() {
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }
}
