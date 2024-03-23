package com.atk1true.threadsession;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<String> f1 = es.submit(new TestThread1());
        Future<Integer> f2 = es.submit(new TestThread2());
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }

}
