package com.george.composite.files;

/**
 * @ClassName ImageFile
 * @Description
 * @Author George
 * @Date 2024/11/19 20:20
 */
// 图像文件
public class ImageFile extends File { // 继承File
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("图片文件展示-----------");
    }
}
