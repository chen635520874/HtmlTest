package com.example.administrator.htmltest.javaProgrammer;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/11.
 */


        /* 题目：将一个正整数n分解质因数。例如：50=2*5*5
        * 思路描述：
        * 1、如果n是质数，就直接结束，打印出来就好
        * 2、如果i能整除n，就打印i，然后更新n = n / i;递归
        * 3、如果i不能整除n，就i++*/


public class zhiYinShu {

    public static void main(String args[]) {

        Scanner a = new Scanner(System.in);
        int m = a.nextInt();
        zhiYinShu(m);
    }

        public static void zhiYinShu(int n){
        for (int i=2;i<=n;i++) {
            if (i == n) {
                System.out.print(i);
                return;
            }
            if (i < n && (n % i == 0)) {
                System.out.print(i + "*");
                zhiYinShu(n / i);
                break;
            }
        }
     }

   /* public static void zhiYinShu(int n) {
        for (int i = 2; i <= n; i++) {
            if (i == n) {
                System.out.print(i);
                return;
            }
            if (n > i && (n % i == 0)) {
                System.out.print(i + "*");
                zhiYinShu(n / i);
                break;
            }
        }
    }*/

}
