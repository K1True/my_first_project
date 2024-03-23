package com.atk1true.listunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class demo01list {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("baga");
        collection.add("cenide");
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("zy");
        collection1.add("lhn");
        collection.addAll(collection1);
        System.out.println(collection);
        collection1.clear();
        System.out.println(collection1);
        boolean result01 = collection.contains("lhn");
        System.out.println("result1="+result01);
        System.out.println(collection1.isEmpty());
        collection.remove("lhn");
        boolean result02 = collection.contains("lhn");
        System.out.println("result2="+result02);
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
