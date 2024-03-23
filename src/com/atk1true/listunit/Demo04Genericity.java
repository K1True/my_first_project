package com.atk1true.listunit;

public class Demo04Genericity {
    public static void main(String[] args) {
        MyArrayList2<String> list1 = new MyArrayList2<>();
        list1.add("现在就只能加入一个String");
        list1.add("调用了MyArrayList类中重写的add方法");
        list1.add("这个是测试MyArrayList类中重写的get方法");
        System.out.println(list1);
        System.out.println(list1.get(2));
    }
}
