package com.thunisoft.lambda.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * lambda综合运用：集合遍历
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 15:22
 * @Version: 1.0
 */
public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);
        //将集合中的每一个元素都带入方法accept中
        list.forEach(System.out::println);
        list.stream().forEach(list1 -> {
            System.out.println(list1);
        });
    }
}
