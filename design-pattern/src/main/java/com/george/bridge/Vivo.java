package com.george.bridge;

/**
 * @ClassName Vivo
 * @Description
 * @Author George
 * @Date 2024/11/16 13:10
 */
public class Vivo implements Brand{
    // 款式
    private String style;

    @Override
    public void open() {
        System.out.println(this.style + " Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(this.style + " Vivo手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(this.style + " Vivo手机打电话 ");
    }

    @Override
    public void setStype(String stype) {
        this.style = stype;
    }
}
