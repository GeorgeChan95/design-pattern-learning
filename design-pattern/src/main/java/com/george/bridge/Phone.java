package com.george.bridge;

/**
 * @ClassName Phone
 * @Description
 * @Author George
 * @Date 2024/11/16 13:01
 */
// 定时抽象类，对应UML中的 Abstraction
public abstract class Phone {

    // 聚合实现
    private Brand brand;

    public Phone(Brand brand, String style) {
        this.brand = brand;
        this.brand.setStype(style);
    }

    // 通过聚合，让抽象类具有 Implementation 的功能
    protected void open() {
        this.brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }
}
