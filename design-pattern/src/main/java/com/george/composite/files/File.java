package com.george.composite.files;

/**
 * @ClassName File
 * @Description
 * @Author George
 * @Date 2024/11/19 20:18
 */
// 抽象类
public abstract class File {

    public String name;

    public File(String name) {
        this.name = name;
    }

    /**
     * 文件打印
     */
    public abstract void show();
}
