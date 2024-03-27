package com.atk1true.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo02BufferedStream {
    public static void main(String[] args)throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/k1true/IdeaProjects/mac_test_project/testdir/test2/1.txt",true));
        bw.write("床前明月光");
        bw.newLine();
        bw.write("疑是地上霜");
        bw.newLine();
        bw.write("举头望明月");
        bw.newLine();
        bw.write("低头思故乡");
        bw.newLine();
        bw.close();
    }
}
