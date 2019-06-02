package com.zhc.util;

/**
 * 定义一个规则的父类，或者接口
 * */
public abstract class  Filter {

    /*责任对象*/
    Filter filter;

    public abstract void doFilter(Integer i);

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

}
