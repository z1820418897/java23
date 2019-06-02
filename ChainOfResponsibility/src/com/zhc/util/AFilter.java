package com.zhc.util;

/**
 * 责任A对象
 * 只能处理500以下的请求
 * */
public class AFilter extends Filter {

    @Override
    public void doFilter(Integer i) {

        /*金额小于500处理请求*/
        if(i<500){
            System.out.println("金额："+i+"--A职位批准");
        }
        /*大于500传递给下一级责任对象*/
        else{
            /*调用传入进去的下一级责任对象  本例子使用A->B->C的规则*/
            getFilter().doFilter(i);
        }

    }
}
