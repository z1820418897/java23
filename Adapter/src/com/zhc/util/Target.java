package com.zhc.util;


/**
 * 这个是所期望得到的接口
 *
 * */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();


}
