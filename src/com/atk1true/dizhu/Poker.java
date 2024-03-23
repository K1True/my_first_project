package com.atk1true.dizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> poker = new ArrayList<>();
        color.add("♣");
        color.add("♦");
        color.add("♥");
        color.add("♠");
        for (int i = 2; i < 10; i++) {
                number.add(i+"");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        //System.out.println(color);
        //System.out.println(number);
        for(String num : number){
            for(String colors : color){
                String pokerIndex = num + colors;
                poker.add(pokerIndex);
            }
        }
        //System.out.println(poker);
        poker.add("大王");
        poker.add("小王");
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        Collections.shuffle(poker);
        for (int i = 0; i < poker.size(); i++) {
            if(i == poker.size() - 4){
                dipai.add(poker.get(i));
                dipai.add(poker.get(i+1));
                dipai.add(poker.get(i+2));
                break;
            }
            else if(i % 3 == 0){
                p1.add(poker.get(i));
            }
            else if(i % 3 == 1){
                p2.add(poker.get(i));
            }
            else if(i % 3 == 2){
                p3.add(poker.get(i));
            }

        }
        System.out.println("第一个玩家的手牌:"+p1);
        System.out.println("第二个玩家的手牌:"+p2);
        System.out.println("第三个玩家的手牌:"+p3);
        System.out.println("底牌是："+dipai);

    }

}
