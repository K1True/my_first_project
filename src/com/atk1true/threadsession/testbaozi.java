package com.atk1true.threadsession;

public class testbaozi {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();
        Produce produce = new Produce(baoZiPu);
        Consumer consumer = new Consumer(baoZiPu);
        Thread t1 = new Thread(produce);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
