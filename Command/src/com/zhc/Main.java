package com.zhc;

import com.zhc.util.*;

/**
 * 命令模式
 * 命令模式属于对象的行为模式，命令模式又称为行动(Action)模式或交易(Transaction)模式。
 *
 * 命令模式把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户端参数化，
 * 对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 *
 * 命令模式的结构
 *
 *       命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
 *
 *       每一个命令都是一个操作：请求的一方发出请求要求执行一个操作；接收的一方收到请求，并执行操作。命令模式允许请求的一方和接收的一方独立开来，使得请求的一方不必知道接收请求的一方的接口，更不必知道请求是怎么被接收，以及操作是否被执行、何时被执行，以及是怎么被执行的。
 *
 *       命令允许请求的一方和接收请求的一方能够独立演化，从而具有以下的优点：
 *
 *       （1）命令模式使新的命令很容易地被加入到系统里。
 *
 *       （2）允许接收请求的一方决定是否要否决请求。
 *
 *       （3）能较容易地设计一个命令队列。
 *
 *       （4）可以容易地实现对请求的撤销和恢复。
 *
 *       （5）在需要的情况下，可以较容易地将命令记入日志。
 *
 *
 *       下面以一个小女孩的录音机例子说明，小女孩只需要按下播放，快进，退回按键，不需要关心命令的具体执行
 * */
public class Main {

    /**
     * 这是客户端 就是小女孩
     * */
    public static void main(String[] args){

        //创建接收者对象  录音机
        AudioPlayer audioPlayer = new AudioPlayer();

        //创建命令 按键
        Command playCommand = new PlayCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);

        //创建键盘
        Keypad keypad=new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setStopCommand(stopCommand);
        keypad.setRewindCommand(rewindCommand);

        //测试
//        keypad.play();
//        keypad.rewind();
//        keypad.stop();
//        keypad.play();
//        keypad.stop();


        /**
         *  宏命令
         *  所谓宏命令简单点说就是包含多个命令的命令，是一个命令的组合。
         *  有点像以前打联盟，DNF的时候用TGP设置的组合连招 按一下就行了
         * */
        //创建宏命令
        MacroCommand macroCommand=new MacroCommand();
        macroCommand.add(playCommand);
        macroCommand.add(rewindCommand);
        macroCommand.add(stopCommand);
        macroCommand.add(playCommand);

        //给键盘加上宏命令按钮
        keypad.setmacroCommand(macroCommand);

        //测试
        keypad.macro();
        macroCommand.remove(playCommand);
        keypad.macro();

    }

}
