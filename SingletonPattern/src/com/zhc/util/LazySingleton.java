package com.zhc.util;

/**
 * 懒汉式
 * 就是延迟创建 类加载的时候为null 使用的时候 不存再创建
 * */
public class LazySingleton {

    private static LazySingleton instance=null;

    private LazySingleton(){};
    /*同步饿汉式 加锁  但是会影响性能 要是想提高性能 建议使用双重检查加锁  要在jdk1.5以后   之前版本的对volatile关键字存在bug*/
    public static synchronized LazySingleton getInstance(){
        if (instance==null){
            instance=new LazySingleton();
        }
        return  instance;
    }

}
