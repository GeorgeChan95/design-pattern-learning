package com.george.composite.files;

/**
 * @ClassName TextFile
 * @Description
 * @Author George
 * @Date 2024/11/19 20:20
 */
// 文本文件
public class TextFile extends File { // 继承File
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("文本文件展示-----------");
    }
}
