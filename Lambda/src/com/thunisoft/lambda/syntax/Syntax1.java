package com.thunisoft.lambda.syntax;

import com.thunisoft.lambda.interfaces.*;

/**
 * lambda基础语法
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 10:33
 * @Version: 1.0
 */
public class Syntax1 {
    public static void main(String[] args) {
        //1、lambd表达式的基础语法。
        //lambda是一个匿名函数
        //参数列表  方法体
        //( ) ：用来描述参数列表
        //{ } : 用来描述方法体
        // -> : lambda运算符，读作goes to

        //无参无返回
        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("hello lambda!");
        };
        lambda1.test();

        //无返回值单个参数
        LambdaNoneReturnSingleParameter lambda2 = (int a) -> {
            System.out.println(a);
        };
        lambda2.test(2);

        //无返回值多个参数
        LambdaNoneReturnMutipleParameter lambda3 = (int a, int b) -> {
            System.out.println(a + b);
        };
        lambda3.test(2, 5);

        //有返回值无参数
        LambdaSingleReturnNoneParameter lambda4 = () ->{
            System.out.println("lambda4");
            return 100;
        };
        int ret1 = lambda4.test();
        System.out.println(ret1);

        //有返回值有单个参数
        LambdaSingleReturnSingParameter lambda5 = (int a) -> {
          return a * 3;
        };
        int ret2 = lambda5.test(5);
        System.out.println(ret2);

        //有返回值多个参数
        LambdaSingleReturnMutipleParameter lambda6 = (int a, int b) -> {
            return a + b;
        };
        int ret3 = lambda6.test(1, 8);
        System.out.println(ret3);
    }
}
