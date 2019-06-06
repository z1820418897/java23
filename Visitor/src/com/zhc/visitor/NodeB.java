package com.zhc.visitor;

public class NodeB extends Node{
    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){

        return "NodeB";
    }

}
