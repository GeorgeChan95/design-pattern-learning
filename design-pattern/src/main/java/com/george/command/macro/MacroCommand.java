package com.george.command.macro;

import com.george.command.audio.Command;

/**
 * 系统需要一个代表宏命令的接口，以定义出具体宏命令所需要的接口。
 */
public interface MacroCommand extends Command {

    /**
     * 宏命令聚集的管理方法，可以添加一个成员命令
     * @param cmd
     */
    void add(Command cmd);

    /**
     * 宏命令聚集的管理方法, 可以删除一个成员命令
     * @param cmd
     */
    void remove(Command cmd);
}
