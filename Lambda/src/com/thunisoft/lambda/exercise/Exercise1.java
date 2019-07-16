package com.thunisoft.lambda.exercise;

import com.thunisoft.lambda.data.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * lambda综合运用：集合排序
 * ArrayList<>
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 14:58
 * @Version: 1.0
 */
public class Exercise1 {

    public static void main(String[] args) {
        //问题：已知在一个ArrayList中有若干个Person对象。将这些Person对象按照年龄进行降序排序。
        List<Person> list = new ArrayList<>();
        list.add(new Person("laoda",11));
        list.add(new Person("laoer",12));
        list.add(new Person("laoan",13));
        list.add(new Person("laodsi",14));
        list.add(new Person("laowu",15));
        list.add(new Person("laoliu",16));

        //排序
        list.sort((o1, o2) -> o2.age - o1.age);
        System.out.println(list);

    }
}
