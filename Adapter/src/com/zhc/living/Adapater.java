package com.zhc.living;

public abstract  class Adapater implements Bonze{

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void say() {
        System.out.println("说");
    }

    @Override
    public void sit() {
        System.out.println("坐");
    }

    @Override
    public void clock() {
        System.out.println("钟");
    }

    @Override
    public void hit() {
        System.out.println("打");
    }

    @Override
    public String getName() {
        return "小和尚";
    }
}
