package com.thunisoft.lambda.data;

/**
 * 数据类
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 14:43
 * @Version: 1.0
 */
public class Person {
    public String name;
    public int age;

    public Person() {
        System.out.println("Person类的无参构造方法执行了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person类的有参构造方法执行了");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
