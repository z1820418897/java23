package com.zhc.util;

public class SubWest2 extends West{
    @Override
    public void gcWest1(SubEast1 esat) {
        System.out.println("SubWest2+"+esat.myName1());
    }

    @Override
    public void gcWest2(SubEast2 esat) {
        System.out.println("SubWest2+"+esat.myName2());
    }
}
