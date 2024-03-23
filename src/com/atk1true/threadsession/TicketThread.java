package com.atk1true.threadsession;

public class TicketThread extends Thread{
    int ticket = 100;
    Object o = new Object();
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized(o){
                if (ticket>0){
                    System.out.println(currentThread().getName()+"买了第"+ticket+"张票");
                    ticket--;
                }
                else if(ticket == 0 ){
                    break;
                }
            }
        }
    }
}
