package com.zhc.visitor;

/**
 * 抽象节点类
 * */
public abstract  class Node {

    //定义接受操作
    public abstract void accpet(Visitor visitor);

}
