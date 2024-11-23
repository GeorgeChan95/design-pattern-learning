package com.george.command.macro;

import com.george.command.audio.*;

/**
 * @ClassName Julia
 * @Description
 * @Author George
 * @Date 2024/11/23 14:55
 */

/**
 * 测试类
 */
public class Julia {
    public static void main(String[] args) {
        // 创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroCommand marco = new MacroAudioCommand();
        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.execute();
    }
}
