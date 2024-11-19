package com.george.composite.files;

/**
 * @ClassName AudioFile
 * @Description
 * @Author George
 * @Date 2024/11/19 20:21
 */
// 音频文件
public class AudioFile extends File { // 继承File
    public AudioFile(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("图片文件展示-----------");
    }
}
