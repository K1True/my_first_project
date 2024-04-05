package com.atk1true.EnumTest;

public enum Demo01enum {
    WEIFUKUAN("未付款"),
    YIFUKUAN("已付款"),
    WEIFAHUO("未发货"),
    YIFAHUO("已发货");
    private String name;
    private Demo01enum(){
    }
    Demo01enum(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
