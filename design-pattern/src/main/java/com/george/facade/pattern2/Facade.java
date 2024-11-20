package com.george.facade.pattern2;

/**
 * @ClassName Facade
 * @Description
 * @Author George
 * @Date 2024/11/20 20:04
 */
// 外观类
public class Facade {
    private SubSystemA systemA;
    private SubSystemB systemB;

    public Facade() {
        this.systemA = new SubSystemA();
        this.systemB = new SubSystemB();
    }

    public void methodA() {
        this.systemA.dosomething();
    }

    public void methodB() {
        this.systemB.dosomething();
    }
}
