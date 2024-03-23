package com.atk1true.threadsession;

public class Produce implements Runnable{
    private BaoZiPu baoZiPu;
    public Produce(BaoZiPu baoZiPu){
        this.baoZiPu = baoZiPu;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while(true) {
                baoZiPu.setCount();
            if(baoZiPu.getRealCount()==100){
                System.out.println("今天的包子已经做完了，不卖了，请回吧！");
                break;
            }
        }
    }
}

