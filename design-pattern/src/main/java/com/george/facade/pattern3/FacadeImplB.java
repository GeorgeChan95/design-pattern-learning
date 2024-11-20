package com.george.facade.pattern3;

/**
 * @ClassName FacadeImpl
 * @Description
 * @Author George
 * @Date 2024/11/20 20:23
 */
// 具体外观类B
public class FacadeImplB implements Facade {

    SubSystem2 subSystem2 = null;
    SubSystem3 subSystem3 = null;
    SubSystem4 subSystem4 = null;

    public FacadeImplB() {
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
        subSystem4 = new SubSystem4();
    }

    @Override
    public void method() {
        subSystem2.method2();
        subSystem3.method3();
        subSystem4.method4();
    }
}
