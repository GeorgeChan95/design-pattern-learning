package com.george.bridge;

/**
 * @ClassName Brand
 * @Description
 * @Author George
 * @Date 2024/11/16 12:58
 */
// 定义实现，对应 UML中的 Implementation
public interface Brand {

    // 开机
    void open();

    // 关机
    void close();

    // 打电话
    void call();

    // 设置手机款式
    void setStype(String stype);
}
