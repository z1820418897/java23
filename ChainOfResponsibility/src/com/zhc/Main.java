package com.zhc;

import com.zhc.util.AFilter;
import com.zhc.util.BFilter;
import com.zhc.util.CFilter;
import com.zhc.util.Filter;

/**
 * 责任链模式
 * 场景：当一个公司内部需要一个审核功能，
 * <500金额的由A职位批准,
 * >500<1000金额的由B职位批准
 * >1000金额的由C职位批准
 * 我们可以使用责任链模式，对金额进行处理
 * 这是存责任链模式，请求被责任链上任意一个处理后，不会继续传递
 * 当然这种场景很少碰到，大多都是半责任链模式，通过责任链，对请求进行处理，具体还要看业务需求
 * */
public class Main {

    public static void main(String[] args){

        /*先定义责任链规则*/
        /*创建责任对象*/
        Filter A=new AFilter();
        Filter B=new BFilter();
        Filter C=new CFilter();
        /*定义规则  A的下一级是B B的下一级是C*/
        A.setFilter(B);
        B.setFilter(C);

        /*开始测试  确保责任链完成 应从A责任开始 所以使用A调用*/

        /*测试---1*/
        int i=300;
        A.doFilter(i);

        /*测试---2*/
        i=600;
        A.doFilter(i);

        /*测试---3*/
        i=2000;
        A.doFilter(i);


        /*要是觉得从A调用不舒服，可以定义一个规则管理者，指定规则，使用管理者调用 */



    }

}
