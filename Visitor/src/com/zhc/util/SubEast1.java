package com.zhc.util;

public class SubEast1 extends  East{
    @Override
    public void goEast(West west) {
        west.gcWest1(this);
    }

    public String myName1(){
        return "SubEast1";
    }

}
