package com.example.administrator.htmltest.javaProgrammer;

/**
 * Created by Administrator on 2017/10/11.
 */



     /*题目：判断101-200之间有多少个素数，并输出所有素数。
     1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
     则表明此数不是素数，反之是素数。
    */

public class sushu {
    public static void main(String args[]){
        int count=0;
        for (int i=101;i<=200;i++){
            boolean b = false;
            for (int j=2;j<i;j++){
             if (i%j==0){
                 b=false;
                 break;
             }else{
                 b=true;
             }
            }
            if (b==true){
                count++;
                System.out.println("素数为"+i);
            }
        }
        System.out.println("一共有"+count+"个素数。");

    }


   /* public static void main(String args[]){

        int count=0,j,i;
        for (i=101;i<=200;i++){
                boolean b =false;
            for (j=2;j<i;j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
                if (b==true){
                    count++;
                    System.out.println("素数为"+i);

            }
        }

        System.out.println("一共有"+count+"个素数。");
    }*/


}
