package com.zhc.util;


/**
 * 责任C对象
 * */
public class CFilter extends Filter{

    @Override
    public void doFilter(Integer i) {
        if(i>1000){
            System.out.println("金额："+i+"--C职位批准");
        }
        else{
            /*按照ABC的规则  到C的不能处理的金额是错误的  或者 你可已使用环形责任链 在传入A责任对象*/
            System.out.println("错误金额");

        }
    }
}
