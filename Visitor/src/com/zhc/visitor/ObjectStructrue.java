package com.zhc.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象角色类
 * 这个结构对象角色持有一个聚集，并向外界提供add()方法作为对聚集的管理操作。
 * 通过调用这个方法，可以动态地增加一个新的节点
 * */
public class ObjectStructrue {
    private List<Node> nodes=new ArrayList<>();


    /**
     * 执行方法操作
     * */
    public void action(Visitor visitor){
        for(Node node:nodes){
            node.accpet(visitor);
        }
    }

    /**
     * 添加新节点
     * */
    public void add(Node node){
        nodes.add(node);
    }


}
