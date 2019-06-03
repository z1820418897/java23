package com.zhc.util;

/**
 * 命令的请求者
 * 录音机里面就是键盘
 * */
public class Keypad {
    /*按键上有几个按键 就是命令*/
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;
    private Command macroCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void setmacroCommand(Command macroCommand) {
        this.macroCommand = macroCommand;
    }

    public void play(){
        playCommand.execute();
    }

    public void rewind(){
        rewindCommand.execute();
    }

    public void stop(){
        stopCommand.execute();
    }

    public void macro() {
        macroCommand.execute();
    }

}
