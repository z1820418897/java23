package com.zhc.util;


/**
 * 适配器角色
 * 这是类的适配器 只是一种实现方式
 * */
public class Adapter extends Adaptee implements Target{

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}
