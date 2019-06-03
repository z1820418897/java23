package com.zhc.util;

/**
 * 播放的命令
 * */
public class PlayCommand implements Command{
    private AudioPlayer audioPlayer;
    public PlayCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
       audioPlayer.play();
    }
}
