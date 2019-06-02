package com.zhc.util;

/**
 * 饿汉式单例
 * 其实就是在类加载的时候就创建出来唯一实例
 * */
public class EagerSingleton {

    private static EagerSingleton instance=new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance(){
        return instance;
    }

}
