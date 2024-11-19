package com.george.composite.files;

/**
 * @ClassName VideoFile
 * @Description
 * @Author George
 * @Date 2024/11/19 20:22
 */
// 视频文件
public class VideoFile extends File { // 继承File
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("视频文件展示-----------");
    }
}
