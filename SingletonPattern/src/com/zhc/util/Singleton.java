package com.zhc.util;

/**
 *
 * 前面的方法都有些缺点  要么浪费时间 要么浪费空间
 * 可以使用内部静态类的方法  中和这些缺点
 * 静态类创建本身就是同步的 让jvm帮我们进行维护
 *
 * 还有就是目前最实用的使用枚举类  最为合适的方法创建单例
 */
public class Singleton {
private Singleton(){}


private static class SingletonHolder{
    private static Singleton instance=new Singleton();

}

public static Singleton getInstance(){

    return SingletonHolder.instance;
}


}
