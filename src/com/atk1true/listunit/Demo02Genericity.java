package com.atk1true.listunit;

import java.util.ArrayList;

public class Demo02Genericity {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        //MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("传入类型变成字符串了");
        list1.add("再试试");
        list1.add("1");
        System.out.println(list1);
        System.out.println("============");
        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list2);
        method(list1);
    }
    //MyArrayList这里行不通，list会编译报错，why？
    public static void method(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
