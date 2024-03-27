package com.atk1true.Regex;

import java.util.Scanner;

public class Demo01Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        method02(data);
        System.out.println("method02(data) = " + method02(data));
    }
    public static boolean method02(String data){
        boolean result = data.matches("[1-9][0-9]{4,14}");
        return result;
    }
}
