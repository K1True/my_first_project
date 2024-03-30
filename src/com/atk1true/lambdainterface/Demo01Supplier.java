package com.atk1true.lambdainterface;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo01Supplier {
    public static void main(String[] args) {
        method(new Supplier<Integer>(){
            @Override
            public Integer get(){
                int[] arr = {3,4,5,6,7,2,1,2,3};
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        });
    }
    public static void method(Supplier<Integer> supplier){
        Integer max = supplier.get();
        System.out.println("max = " + max);
    }
}
