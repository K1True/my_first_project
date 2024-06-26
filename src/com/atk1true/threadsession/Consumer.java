package com.atk1true.threadsession;

public class Consumer implements Runnable {
    private BaoZiPu baoZiPu;

    public Consumer(BaoZiPu baoZiPu) {
        this.baoZiPu = baoZiPu;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            baoZiPu.getCount();
        }
    }
}

