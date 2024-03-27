package com.atk1true.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01BufferedStream {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    //使用字节缓冲流复制文件
    private static void method02()throws Exception {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("/Users/k1true/IdeaProjects/mac_test_project/testdir/test2/1.txt");
        FileOutputStream fos = new FileOutputStream("/Users/k1true/IdeaProjects/mac_test_project/testdir/test2/1.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //边读编写
        int len;
        while((len = bis.read())!=-1){
            bos.write(len);
            bos.write("abc".getBytes());
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        bos.close();
        bis.close();
    }

    //用基本流复制文件
    private static void method01()throws Exception {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("/Users/k1true/IdeaProjects/mac_test_project/testdir/test2/1.txt");
        FileOutputStream fos = new FileOutputStream("/Users/k1true/IdeaProjects/mac_test_project/testdir/test2/1.txt");
        //边读编写
        int len;
        while((len = fis.read())!=-1){
            fos.write(len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        fos.close();
        fis.close();
    }
}
