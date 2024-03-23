package com.atk1true.listunit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo04LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("wo");
        list.add("wawawawa");
        list.add("ee");
        list.add("waka");
        System.out.println(list);
        list.addFirst("diyige");
        list.addLast("zuihouyige");
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.push("mama");
        System.out.println(list);
    }
    @Test
    public void add(){
        System.out.println("我是一个add方法");
    }
    @Test
    public void delete(){
        System.out.println("我是一个delete方法");
    }
}
