package com.thunisoft.lambda.syntax;

import com.thunisoft.lambda.interfaces.LambdaSingleReturnSingParameter;

/**
 * lambda语法进阶
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 14:32
 * @Version: 1.0
 */
public class Syntax3 {
    public static void main(String[] args) {
        //方法引用：
        //可以快速将一个lambda表达式的实现指向一个已经实现的方法
        //语法：方法的隶属者::方法名
        //注意：
        //1、参数数量和类型一定要和接口中的定义方法一致
        //2、返回值的类型一定要和接口中定义的方法一致
        LambdaSingleReturnSingParameter lambda1 = a -> change(a);

        //方法引用：引用了change方法的实现
        LambdaSingleReturnSingParameter lambda2 = Syntax3::change;
    }

    private static int change(int a) {
        return a * 2;
    }
}
