package com.zhc.visitor;

public class NodeA extends Node{
    //接受操作
    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }

    //NodeA特有的方法
    public String operationA(){
        return "NodeA";
    }

}
