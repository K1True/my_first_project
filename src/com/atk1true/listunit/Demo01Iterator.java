package com.atk1true.listunit;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("lhn");
        list1.add("lyz");
        list1.add("zy");
        list1.add("chh");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
