package com.george.mediator.example2;

/**
 * 同事类-CPU
 */
public class CPU extends Colleague {

    //分解出来的视频数据
    private String videoData = "";

    //分解出来的声音数据
    private String soundData = "";

    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 获取视频数据
     * @return
     */
    public String getVideoData() {
        return videoData;
    }

    /**
     * 获取音频数据
     * @return
     */
    public String getSoundData() {
        return soundData;
    }

    /**
     * 接收主板调用，将数据解析成视频数据和音频数据
     * @param data
     */
    public void executeData(String data) {
        System.out.println("~CPU工作中");
        String[] dataArr = data.split(",");
        this.soundData = dataArr[0];
        this.videoData = dataArr[1];

        // 解析完成后通知主板（中介者），进行下一步处理
        this.getMediator().changed(this);
    }
}
