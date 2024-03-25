package com.atk1true.file;

import java.io.File;
import java.io.IOException;

public class Demo02File {
    public static void main(String[] args) throws IOException {
        //File(String parent, String child) 根据所填写的路径创建File对象
        //parent:父路径
        //child:子路径
        File file1 = new File("/Users/k1true/Downloads/example","1.jpg");
        System.out.println("file1 = " + file1);
        //File(File parent, String child)  根据所填写的路径创建File对象
        //parent:父路径,是一个File对象
        //child:子路径
        File parent = new File("/Users/k1true/Downloads/example");
        File file2 = new File(parent,"2.jpg");
        System.out.println("file2 = " + file2);
        //File(String pathname)  根据所填写的路径创建File对象
        //pathname:直接指定路径
        File file3 = new File("/Users/k1true/Downloads/example/3.jpg");
        System.out.println("file3 = " + file3);
        file01();
        file02();
        file03();
    }
    public static void file01(){
        //String getAbsolutePath()  ->获取File的绝对路径->带盘符的路径
        File file1 = new File("1.txt");
        System.out.println("file1.getAbsoluteFile() = " + file1.getAbsoluteFile());
        File file2 = new File("IDEA/IO/1.txt");
        System.out.println("file2.getPath() = " + file2.getPath());
        System.out.println("file2.getName() = " + file2.getName());
        System.out.println("file2.length() = " + file2.length());
    }
    public static void file02() throws IOException {
        File file1 = new File("/Users/k1true/IdeaProjects/mac_test_project/1.txt");
        System.out.println("file1.createNewFile() = " + file1.createNewFile());
        File file2 = new File("/Users/k1true/IdeaProjects/mac_test_project/testdir");
        System.out.println("file2.mkdirs() = " + file2.mkdirs());
    }
    public static void file03(){
        File file1 = new File("/Users/k1true/IdeaProjects/mac_test_project/1.txt");
        System.out.println("file1.delete() = " + file1.delete());
    }
}
