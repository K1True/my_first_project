package com.atk1true.file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        file01();
    }
    public static void file01(){
        String pathSeparator = File.pathSeparator;
        System.out.println("pathSeparator = " + pathSeparator);
        String separator = File.separator;
        System.out.println("separator = " + separator);
    }
}
