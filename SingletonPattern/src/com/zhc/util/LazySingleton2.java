package com.zhc.util;

//双重检查同步实现懒汉式单例*/
public class LazySingleton2 {

    private volatile static LazySingleton2 instance = null;

    private LazySingleton2() {}

    public static LazySingleton2 getIntance() {

        //先检查实例是否存在
        if (instance == null) {
            //同步块
            synchronized (LazySingleton2.class){
                //再次检查实例是否存在
                if(instance==null){
                    instance=new LazySingleton2();
                }

            }


        }

        return instance;
    }


}
