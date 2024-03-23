package com.atk1true.threadsession;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "刘浩南叫了一下";
    }
}
