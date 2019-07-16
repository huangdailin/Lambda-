package com.thunisoft.lambda;

/**
 * java类简单作用描述
 *
 * @Author: huangdailin
 * @CreateDate: 2019/7/15 17:25
 * @Version: 1.0
 */
public class Program {
    public static void main(String[] args) {

        //1、使用接口实现类
        Comparator comparator = new MyComparator();

        //2、使用匿名内部类
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a - b;
            }
        };

        //3、使用lambda表达式来实现接口
        Comparator comparator2 = (a, b) -> a - b;
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(int a, int b) {
        return a - b;
    }
}

@FunctionalInterface
interface Comparator {
    int compare(int a, int b);
}
