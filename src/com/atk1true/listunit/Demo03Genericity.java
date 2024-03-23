package com.atk1true.listunit;

import java.util.ArrayList;

public class Demo03Genericity {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtils.addAll(list1,"sadasda","sdadasdasda");
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtils.addAll(list2,1,2,3,3,3,4,5,6);
        System.out.println(list2);
    }
}
