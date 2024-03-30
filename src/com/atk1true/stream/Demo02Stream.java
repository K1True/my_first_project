package com.atk1true.stream;
//        1. 第一个队伍只要名字为3个字的成员姓名；//filter
//
//        2. 第一个队伍筛选之后只要前3个人；//limit
//
//        3. 第二个队伍只要姓张的成员姓名；//filter
//
//        4. 第二个队伍筛选之后不要前2个人；//skip
//
//        5. 将两个队伍合并为一个队伍；//concat
//
//        6. 打印整个队伍的姓名信息。//forEeach

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo02Stream {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("迪丽热巴");
        list1.add("宋远桥");
        list1.add("苏星河");
        list1.add("老子");
        list1.add("庄子");
        list1.add("孙子");
        list1.add("洪七公");
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");
        Stream<String> team1 = list1.stream();
        Stream<String> team2 = two.stream();
        Stream<String> listA = team1.filter(s -> s.length() == 3).limit(3);
        Stream<String> listB = team2.filter(s -> s.startsWith("张")).skip(2);
        Stream.concat(listA,listB).forEach(s -> System.out.println("s = " + s));

    }
}
