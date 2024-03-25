package com.atk1true.dizhu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Map_Poker {
    public static void main(String[] args) {
        String[] color = "♠-♥-♣-♦".split("-");
        System.out.println(Arrays.toString(color));
        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");
        System.out.println(Arrays.toString(number));
        //创建HashMap集合，key为序号，value为组合好的牌面。
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        int key = 2;
        for (String num : number) {
            for (String colors : color) {
                String pokers = colors + num;
                list.add(key);
                poker.put(key,pokers);
                key++;
            }
        }
        poker.put(0,"小王");
        poker.put(1,"大王");
        System.out.println(poker);
        Collections.shuffle(list);
        //创建四个list集合
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer key1 = list.get(i);
            if (i>=51){
                dipai.add(key1);
            }else if (i%3==0){
                p1.add(key1);
            }else if (i%3==1){
                p2.add(key1);
            }else if (i%3==2){
                p3.add(key1);
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(dipai);

        lookPoker("涛哥",p1,poker);
        lookPoker("三上",p2,poker);
        lookPoker("金莲",p3,poker);
        lookPoker("大郎",dipai,poker);
    }

    private static void lookPoker(String name, ArrayList<Integer> list, HashMap<Integer, String> map) {
        System.out.print(name+":");

        for (Integer key : list) {
            String value = map.get(key);
            System.out.print(value+" ");
        }

        System.out.println();
    }
}

