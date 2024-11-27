package com.george.mediator.example2;

/**
 * 同事类-显卡
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放视频内容
     * @param data
     */
    public void showData(String data) {
        System.out.println("~显卡工作中");
        System.out.println("您正在观看内容：" + data);
    }
}
