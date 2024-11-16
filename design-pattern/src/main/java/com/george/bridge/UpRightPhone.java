package com.george.bridge;

/**
 * @ClassName UpRightPhone
 * @Description
 * @Author George
 * @Date 2024/11/16 13:24
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand, "直板式");
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
