package com.george.mediator.example2;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者
        MainBoard mainBoard = new MainBoard();
        // 具体同事类-驱动器
        CDDriver cdDriver = new CDDriver(mainBoard);
        // 具体同事类-CPU
        CPU cpu = new CPU(mainBoard);
        // 具体同事类-显卡
        VideoCard videoCard = new VideoCard(mainBoard);
        // 具体同事类-声卡
        SoundCard soundCard = new SoundCard(mainBoard);

        // 设置中介者管理的同事类
        mainBoard.setCdDriver(cdDriver);
        mainBoard.setCpu(cpu);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setVideoCard(videoCard);

        // 开始读取CD
        cdDriver.readCD();
    }
}
