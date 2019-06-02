package com.zhc.util;


/**
 * 责任B对象
 * */
public class BFilter extends Filter {

    @Override
    public void doFilter(Integer i) {
        if(i>=500&&i<1000){
            System.out.println("金额："+i+"--B职位批准");
        }
        else{
            getFilter().doFilter(i);
        }
    }
}
