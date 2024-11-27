package com.george.mediator.example2;

/**
 * 具体调停者-主板
 */
public class MainBoard implements Mediator {

    // 驱动
    private CDDriver cdDriver;
    // CPU
    private CPU cpu;
    // 声卡
    private SoundCard soundCard;
    // 显卡
    private VideoCard videoCard;

    @Override
    public void changed(Colleague c) {
        if (c instanceof CDDriver) {
            // 数据读取
            this.cdDriverReadData((CDDriver) c);
        } else if (c instanceof CPU) {
            this.openCPU((CPU) c);
        }
    }



    /**
     * CDDriver读取数据，调用CPU处理数据
     * @param cdDriver
     */
    public void cdDriverReadData(CDDriver cdDriver) {
        String data = cdDriver.getData();
        cpu.executeData(data);
    }

    /**
     * CPU解析数据，调用显卡、声卡处理数据
     * @param cpu
     */
    private void openCPU(CPU cpu) {
        // 解析数据
        String soundData = cpu.getSoundData();
        String videoData = cpu.getVideoData();

        // 声卡播放数据
        this.soundCard.soundData(soundData);
        // 显卡播放数据
        this.videoCard.showData(videoData);
    }

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }


}
