package com.george.bridge;

/**
 * @ClassName FoldedPhone
 * @Description
 * @Author George
 * @Date 2024/11/16 13:11
 */
// 折叠手机
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand, "折叠式");
    }

    @Override
    protected void open() {
        super.open();

    }

    @Override
    protected void close() {
        super.close();
    }

    @Override
    protected void call() {
        super.call();
    }
}
