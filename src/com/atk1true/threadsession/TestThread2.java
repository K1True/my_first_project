package com.atk1true.threadsession;

import java.util.concurrent.Callable;

public class TestThread2 implements Callable {
    @Override
    public Integer call() throws Exception {
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num += i;
        }
        return num;
    }
}
