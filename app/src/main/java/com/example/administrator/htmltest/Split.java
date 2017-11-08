package com.example.administrator.htmltest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/9/22.
 */

public class Split {

    public static void main(String[] args) {

        String srcstring = "this is a about split test";
        String[] stringarray = srcstring.split(" ");
        // 在每个空格字符处进行分解
        for (String stemp : stringarray) {
            System.out.println(stemp);
        }
        String srcstring1 = " this  is a about split  test";//有n个空格的话，分成的数组长度为n+1
        //如果字符串中有多个空格时，则两个空格间认为是没有字符，结果字符串数组中该位置为空。
        String stringarray1[] = srcstring1.split(" ");
        for (String stemp : stringarray1) {
            System.out.println(stemp);
        }

        System.out.println("--------------------------------------");

        // 查找以 Java 开头 , 任意结尾的字符串
        Pattern pattern = Pattern.compile("^Java.*");
        Matcher matcher = pattern.matcher("Java 不是人 ");
        boolean b= matcher.matches();
        // 当条件满足时，将返回 true ，否则返回 false
        System.out.println(b);
    }
}