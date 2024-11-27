package com.george.mediator.example2;

/**
 * 同事类-声卡
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频
     * @param data
     */
    public void soundData(String data) {
        System.out.println("~声卡工作中");
        System.out.println("您正在收听的是：" + data);
    }
}
