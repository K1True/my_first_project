package com.atk1true.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream in = Demo01Reflect.class.getClassLoader().getResourceAsStream("FrameTest.properties");
        properties.load(in);
        //System.out.println("properties = " + properties);
        String methodName = properties.getProperty("methodName");
        String className = properties.getProperty("className");
        System.out.println("className = " + className);
        System.out.println("methodName = " + methodName);
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
