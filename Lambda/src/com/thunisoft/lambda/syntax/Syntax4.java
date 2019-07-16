package com.thunisoft.lambda.syntax;

import com.thunisoft.lambda.data.Person;

/**
 * 构造方法引用
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/16 14:47
 * @Version: 1.0
 */
public class Syntax4 {
    public static void main(String[] args) {

        PersonCreater create = () -> new Person();

        //构造方法的引用：
        PersonCreater create1 = Person::new;
        Person a = create1.getPerson();

        PersonCreater2 create2 = Person::new;
        Person b = create2.getPerson("name",12);
    }
}

//无参构造
interface PersonCreater {
    Person getPerson();
}

interface PersonCreater2 {
    Person getPerson(String name, int age);
}
