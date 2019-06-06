package com.zhc.util;

public class SubEast2 extends East{
    @Override
    public void goEast(West west) {
        west.gcWest2(this);
    }
    public String myName2(){
        return "SubEast2";
    }

}
