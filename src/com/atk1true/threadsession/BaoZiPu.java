package com.atk1true.threadsession;

public class BaoZiPu {
    private int count = 1;
    private boolean flag = false;

    public BaoZiPu(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    public BaoZiPu() {
    }

    public synchronized void getCount() {
        if(!this.flag){
            try{
                this.wait();
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("消费了第"+count+"个包子");
        this.flag = false;
        this.notify();
    }
    public int getRealCount(){
        return this.count;
    }
    public synchronized void setCount() {
        if(this.flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        count++;
        System.out.println("生产了第"+count+"个包子");
        this.flag = true;
        this.notify();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
