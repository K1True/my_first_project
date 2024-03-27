package com.atk1true.file;

import org.apache.commons.io.IOUtils;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Utils {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("module01/commons.txt");
            fw.write("你好");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fw!=null){
                IOUtils.closeQuietly(fw);
            }
        }
    }
}
