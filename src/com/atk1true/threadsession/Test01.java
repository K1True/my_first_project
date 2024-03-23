package com.atk1true.threadsession;

import static java.lang.Thread.sleep;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程对象
        MyThread thread1 = new MyThread();
        //调用start方法，开启线程
        thread1.start();
        for (int i = 1; i < 5; i++) {
            Thread.sleep(1000L); //线程睡眠
            System.out.println(Thread.currentThread().getName()+"线程执行了"+i+"次");
        }
        TicketThread myticket = new TicketThread();
        Thread ticket1 = new Thread(myticket,"张三");
        Thread ticket2 = new Thread(myticket,"李四");
        Thread ticket3 = new Thread(myticket,"王五");
        ticket1.start();
        ticket2.start();
        ticket3.start();
    }
}
