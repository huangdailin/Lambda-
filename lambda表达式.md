## Lambda表达式

下面是一些lambda表达式：

```Java
(int x, int y) -> x + y
```

表示接收x和y这两个整型参数并返回他们的和。

```java
() - > 42
```

表示不接收参数，返回整数'42';

```java
(String s) -> {
	System.out.println(s);
}
```

表示接收一个字符串并把它打印到控制台，不返回值。