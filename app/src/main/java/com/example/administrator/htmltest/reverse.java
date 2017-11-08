package com.example.administrator.htmltest;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Administrator on 2017/9/25.
 */

public class reverse {

    public static void main(String[] args){
        reverseWord("the sky is blue");
        reverseWord1("ni hao ma");


    }
    public static String reverseWord(String s){

        String res ="";
        String[] words =s.trim().split("\\s+");
        for (int i=words.length-1;i>=0;i--){
            res +=words[i]+" ";
        }

        System.out.println(res);
        return res;
    }


        public static String reverseWord1(String s) {
            int storeIndex = 0, n = s.length();
            StringBuilder sb = new StringBuilder(s).reverse();
            for (int i = 0; i < n; ++i) {
                if (sb.charAt(i) != ' ') {
                    if (storeIndex != 0) sb.setCharAt(storeIndex++, ' ');
                    int j = i;
                    while (j < n && sb.charAt(j) != ' ') sb.setCharAt(storeIndex++, sb.charAt(j++));
                    String t = new StringBuilder(sb.substring(storeIndex - (j - i), storeIndex)).reverse().toString();
                    sb.replace(storeIndex - (j - i), storeIndex, t);
                    i = j;
                }
            }
            sb.setLength(storeIndex);

            System.out.println(sb);
            return sb.toString();
        }



}
