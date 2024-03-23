package com.atk1true.threadsession;

import java.util.concurrent.Callable;

public class TestThread1 implements Callable {
    @Override
    public String call() throws Exception {
        return "返回一串字符串";
    }
}
