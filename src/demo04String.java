import javax.print.DocFlavor;
import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class demo04String {


    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "abcdefg";
        //int length() -> 获取字符串长度
        System.out.println(s1.length());
        //String concat(String s) -> 字符串拼接，返回新串儿
        System.out.println(s1.concat("wuwuwuwuw"));
        //char charAt(int index) -> 根据索引获取对应的字符
        System.out.println(s1.charAt(4));
        //int indexOf(String s) -> 获取指定字符串在大字符串中第一次出现的索引位置
        System.out.println(s1.indexOf("e"));
//      String subString(int beginIndex) -> 截取字符串,从指定索引开始截取到最后,返回新串儿
        System.out.println(s1.substring(5));
//      String subString(int beginIndex,int endIndex) -> 截取字符串,从beginIndex开始到endIndex结束
//      含头不含尾,返回新串儿
        System.out.println((s1.substring(1,3)));
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
//        1.char[] toCharArray() -> 将字符串转成char数组
//        2.byte[] getBytes() -> 将字符串转成byte数组
//        3.String replace(CharSequence c1,CharSequence c2)-> 替换字符
//        CharSequence->String的接口
//
//        4.byte[] getBytes(String charsetName) -> 按照指定的编码将字符串转成byte数组
        System.out.println(s1.toCharArray());
        System.out.println(s1.getBytes());
        System.out.println(s1.replace("a","c"));
        System.out.println(s1.getBytes("GBK"));
//        -----------
//
//
//
//      ----------------------------------
        Scanner sc = new Scanner(System.in);
        String character1 = sc.nextLine();
        int bigChar = 0 ;
        int smallChar = 0;
        int intcount = 0;
        for (int i = 0; i < character1.length(); i++) {
            if (character1.charAt(i)>=65 & character1.charAt(i)<=90){
                bigChar += 1;
                }
            else if(character1.charAt(i)>=48 && character1.charAt(i) <=57){
                intcount += 1;
            }
            else if(character1.charAt(i)>=97 && character1.charAt(i)<=122){
                smallChar += 1;
            }
        }
        System.out.println(smallChar);
        System.out.println(bigChar);
        System.out.println(intcount);
//      ----------------
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("张无忌");
        System.out.println(sb1);
        System.out.println(sb);
        System.out.println(sb==sb1);//判断地址值是否相等，结果返回true，地址值是相等的，证明stringbuilder.append
        //之后并未产生新对象。

        System.out.println("==============");
        //链式调用
        sb.append("赵敏").append("周芷若").append("小昭");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);
    }
//    键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
//    步骤:
//            1.创建Scanner对象,键盘录入
//  2.定义三个变量,用来统计
//  3.调用next方法录入一个字符串,遍历字符串,将每一个字符拿出来
//  4.统计大写字母
//    A-Z -> 65-90
//    比如:B -> 66 -> 在65-90之间,证明就是大写字母
//  5.统计小写字母
//    a-z -> 97-122
//    比如:b -> 98 -> 在97-122之间,证明就是小写字母
//  6.统计数字:
//            0-9 -> 48-57
//    比如:字符1 -> 49 -> 在48-57之间,证明就是数字
//  7.将统计结果打印出来

}
