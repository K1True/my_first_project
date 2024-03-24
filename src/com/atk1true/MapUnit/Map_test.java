package com.atk1true.MapUnit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//    需求:用Map集合统计字符串中每一个字符出现的次数
//    步骤:
//  1.创建Scanner和HashMap
//  2.遍历字符串,将每一个字符获取出来
//  3.判断,map中是否包含遍历出来的字符 -> containsKey
//  4.如果不包含,证明此字符第一次出现,直接将此字符和1存储到map中
//  5.如果包含,根据字符获取对应的value,让value++
//            6.将此字符和改变后的value重新保存到map集合中
//  7.输出
public class Map_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map =  new HashMap<>();
        String data = sc.next();
        char[] chars = data.toCharArray();
        for(char aChar :chars){
            String key = aChar+"";
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                Integer value = map.get(key);
                value++;
                map.put(key,value);
            }
        }
        System.out.println(map);
    }
}
