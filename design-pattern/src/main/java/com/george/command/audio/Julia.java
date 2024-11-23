package com.george.command.audio;

/**
 * @ClassName Julia
 * @Description
 * @Author George
 * @Date 2024/11/23 14:36
 */

/**
 * 测试类
 */
public class Julia {
    public static void main(String[] args) {
        // 创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        // 创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        // 创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        // 测试
        keypad.play();
        keypad.stop();
        keypad.rewind();
        keypad.stop();
        keypad.play();
    }
}
