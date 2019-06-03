package com.zhc.util;


import java.util.ArrayList;
import java.util.List;

/**
 * 系统需要代表宏命令的接口
 * 以定义出具体宏命令所需要的接口。
 */
public class MacroCommand implements Command {

    private List<Command> commandList = new ArrayList<Command>();

    public void add(Command command) {
        commandList.add(command);
    }

    public void remove(Command command) {
        commandList.remove(command);
    }

    @Override
    public void execute() {
        for (Command command:commandList) {
            command.execute();
        }
    }
}
