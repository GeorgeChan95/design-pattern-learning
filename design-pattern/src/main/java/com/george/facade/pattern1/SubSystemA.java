package com.george.facade.pattern1;

/**
 * @ClassName SubSystemA
 * @Description
 * @Author George
 * @Date 2024/11/20 20:02
 */
// 子系统A
public class SubSystemA implements MySystem {
    @Override
    public void dosomething() {
        System.out.println("子系统方法A");
    }
}
