package com.george.composite.files;

/**
 * @ClassName FileClient
 * @Description
 * @Author George
 * @Date 2024/11/19 20:25
 */
// 测试类
public class FileClient {
    public static void main(String[] args) {
        File textFile1 = new TextFile("text1文件");
        File imageFile1 = new ImageFile("image1文件");
        File audioFile1 = new AudioFile("audio1文件");
        File videoFile1 = new VideoFile("video1文件");
        Folder folder1 = new Folder("folder1");
        folder1.add(textFile1);
        folder1.add(imageFile1);
        folder1.add(audioFile1);
        folder1.add(videoFile1);

        File textFile2 = new TextFile("text2文件");
        File imageFile2 = new ImageFile("image2文件");
        Folder folder2 = new Folder("folder2");
        folder2.add(textFile2);
        folder2.add(imageFile2);

        // 将文件夹2 添加到文件夹1中
        folder1.add(folder2);

        folder1.show();
    }
}
