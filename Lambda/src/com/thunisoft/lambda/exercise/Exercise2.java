package com.thunisoft.lambda.exercise;

import com.thunisoft.lambda.data.Person;

import java.util.TreeSet;

/**
 * lambda综合运用：集合排序
 * TreeSet
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 15:12
 * @Version: 1.0
 */
public class Exercise2 {
    public static void main(String[] args) {
        //使用lambda表达式来实现Comparator接口，并实例化一个TreeSet对象
        TreeSet<Person> set = new TreeSet<>((o1, o2) -> o2.age - o1.age);
        set.add(new Person("laoda",11));
        set.add(new Person("laoer",12));
        set.add(new Person("laoan",13));
        set.add(new Person("laodsi",14));
        set.add(new Person("laowu",15));
        set.add(new Person("laoliu",16));

        System.out.println(set);
    }
}
