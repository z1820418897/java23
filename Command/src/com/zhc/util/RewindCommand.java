package com.zhc.util;


/**
 * 倒退的命令
 * */
public class RewindCommand implements Command{

    private AudioPlayer audioPlayer;
    public RewindCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
