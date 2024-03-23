package com.atk1true.threadsession;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Mythread执行了"+i+"次");
        }
    }
}
