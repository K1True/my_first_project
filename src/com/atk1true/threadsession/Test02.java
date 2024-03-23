package com.atk1true.threadsession;

public class Test02 {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();

        Produce product = new Produce(baoZiPu);
        Consumer consumer = new Consumer(baoZiPu);

        new Thread(product).start();
        new Thread(product).start();
        new Thread(product).start();

        new Thread(consumer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
