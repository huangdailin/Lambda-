package com.thunisoft.lambda.syntax;

import com.thunisoft.lambda.interfaces.LambdaNoneReturnMutipleParameter;
import com.thunisoft.lambda.interfaces.LambdaNoneReturnSingleParameter;
import com.thunisoft.lambda.interfaces.LambdaSingleReturnMutipleParameter;
import com.thunisoft.lambda.interfaces.LambdaSingleReturnNoneParameter;


/**
 * lambda语法精简
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 11:10
 * @Version: 1.0
 */
public class Syntax2 {
    public static void main(String[] args) {
        //1、参数类型：
        //由于在接口的抽象方法中，已经定义了参数的数量和类型。所以在lambda表达式中，参数类型可以省略
        //注意：如果需要省略参数类型，每一个参类型都要省略，不要有的省略，有的不省略
        LambdaNoneReturnMutipleParameter lambda1 = (a, b) -> {
            System.out.println("hello lambda!");
        };

        //2、参数小括号
        //如果参数列表中，参数数量只有一个，此时小括号可以省略
        LambdaNoneReturnSingleParameter lambda2 = a -> {
            System.out.println("hello lambda1!");
        };

        //3、方法大括号
        //如果方法体中只有一条语句，大括号可以省略
        LambdaNoneReturnSingleParameter lambda3 = a -> System.out.println("hello lambda2");

        //4、如果方法体中唯一的一条语句是一个返回语句，则在省略大括号的同时也必须省略return
        LambdaSingleReturnNoneParameter lambda4 = () -> 99 ;

        LambdaSingleReturnMutipleParameter lambda5 = (a, b) -> a + b;



    }
}
