package com.george.command.macro;

import com.george.command.audio.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的宏命令MacroAudioCommand类负责把个别的命令合成宏命令。
 */
public class MacroAudioCommand implements MacroCommand {
    List<Command> commandList = new ArrayList<>();

    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }

    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }

}
