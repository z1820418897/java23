package com.zhc.visitor;

/**
 * 抽象访问者
 * 给每个具体节点提供访问操作
 * */
public interface Visitor {

    public void visit(NodeA node);

    public void visit(NodeB node);
}
