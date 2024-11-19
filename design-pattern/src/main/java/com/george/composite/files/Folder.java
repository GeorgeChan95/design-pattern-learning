package com.george.composite.files;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Folder
 * @Description
 * @Author George
 * @Date 2024/11/19 20:23
 */
public class Folder extends File { // 继承File

    // 组合File
    private List<File> files = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(File file) {
        files.add(file);
    }

    @Override
    public void show() { // 递归调用 show() 方法
        System.out.println("这是 " + this.name + " 的show方法");
        for (File file : files) {
            file.show();
        }
    }
}
