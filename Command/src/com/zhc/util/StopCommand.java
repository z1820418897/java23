package com.zhc.util;
/**
 * 停止的命令
 * */
public class StopCommand implements Command{

    private AudioPlayer audioPlayer;
    public StopCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
