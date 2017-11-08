package com.example.administrator.htmltest.javaProgrammer;

/**
 * Created by Administrator on 2017/10/11.
 */


/**
 * JAVA经典算法40例 【程序1】题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 1.程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....
 *
 *
 */

public class tutu {
    public static void main(String args[]){
        int i=0;
        for (i=1;i<=20;i++){
            System.out.println(tutu(i));
        }
    }
    public static int tutu(int x){
        if (x==1||x==2){
            return 1;
        }else{
            return tutu(x-1)+tutu(x-2);
        }
    }


   /* public static void main(String args[]) {
        int i = 0;
        for (i = 1; i <= 20; i++) {
            System.out.println(f(i));
        }
    }
        public static int f(int x){
        if (x==1||x==2){
            return 1;
        }else {
            return f(x-1)+f(x-2);
        }
    }*/
}
