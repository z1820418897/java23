package com.zhc;

import com.zhc.util.*;

/**
 * 单例模式
 * 作为对象的创建模式，单例模式确保某一个类只有一个实例，
 * 而且自行实例化向整个系统提供这个实例
 * 这个类称为单例类
 *
 * 单例类的特点
 * 单例类只能有一个实例
 * 单例类必须自己创建自己的唯一实例
 * 单例类必须给所有其他对象提供这一实例
 * */

public class Main {

    public static void main(String[] args){

        System.out.println("饿汉式："+EagerSingleton.getInstance());
        System.out.println("枚举："+Esingleton.uniqueinstance);
        System.out.println("懒汉式："+LazySingleton.getInstance());
        System.out.println("懒汉式："+LazySingleton2.getIntance());
        System.out.println("懒汉式："+Singleton.getInstance());




    }

}
