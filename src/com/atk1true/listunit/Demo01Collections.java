package com.atk1true.listunit;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList,"笨蛋","哇","朱旸","是");
        System.out.println(stringArrayList);
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        ArrayList<String> countList1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Collections.shuffle(stringArrayList);
            countList1.add(stringArrayList.get(1));
            if(!stringArrayList.equals(stringArrayList1)){
                stringArrayList1.clear();
                stringArrayList1.addAll(stringArrayList);
                System.out.println(stringArrayList1);
            }

        }
    }
}
