package com.george.facade.pattern1;

/**
 * @ClassName SubSystemB
 * @Description
 * @Author George
 * @Date 2024/11/20 20:03
 */
// 子系统B
public class SubSystemB implements MySystem {
    @Override
    public void dosomething() {
        System.out.println("子系统方法B ");
    }
}
