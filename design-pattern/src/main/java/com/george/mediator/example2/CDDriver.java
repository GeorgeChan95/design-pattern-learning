package com.george.mediator.example2;

/**
 * 同事类-光驱
 */
public class CDDriver extends Colleague {

    // 读取的数据
    private String data;

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 读取数据
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * 读取光盘
     */
    public void readCD() {
        System.out.println("~驱动器工作中");
        // 逗号前是视频显示的数据，逗号后是声音
        this.data = "One Piece,海贼王我当定了";

        // 通知主板（中介者），已经读取到数据了
        this.getMediator().changed(this);
    }
}
