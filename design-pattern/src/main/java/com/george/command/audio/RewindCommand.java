package com.george.command.audio;

/**
 * @ClassName PlayCommand
 * @Description
 * @Author George
 * @Date 2024/11/23 14:32
 */

/**
 * 具体命令角色：倒带命令
 */
public class RewindCommand implements Command {
    // 命令接收者
    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
