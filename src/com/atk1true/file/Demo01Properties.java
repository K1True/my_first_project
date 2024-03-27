package com.atk1true.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("module01/jdbc.properties");
        properties.load(fis);
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println("key = " + key);
            System.out.println("value = " + properties.getProperty(key));
        }
    }
}
