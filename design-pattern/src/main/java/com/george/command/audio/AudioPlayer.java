package com.george.command.audio;

/**
 * 接收者角色：录音机
 */
public class AudioPlayer {
    public void play(){
        System.out.println("录音机播放...");
    }

    public void rewind(){
        System.out.println("录音机倒带...");
    }

    public void stop(){
        System.out.println("录音机停止...");
    }
}
