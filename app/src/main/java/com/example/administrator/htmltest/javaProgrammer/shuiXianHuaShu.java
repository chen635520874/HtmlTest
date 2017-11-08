package com.example.administrator.htmltest.javaProgrammer;

/**
 * Created by Administrator on 2017/10/11.
 */


/*

    题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
     如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
      1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
*/

public class shuiXianHuaShu {
    public static void main(String args[]){
        Math myMath = new Math();
       for (int i=100;i<=999;i++){
           if (myMath.isShuiXianHuaShu(i)==true){
               System.out.println(i);
           }
       }
    }
    public static class Math{
        public boolean isShuiXianHuaShu(int x){
            int i,j,k;
            i=x/100;
            j=x%100/10;
            k=x%10;
            if (i*i*i+j*j*j+k*k*k==x){
                return true;
            }else  {
                  return false;
            }
        }
    }









   /* public static void main(String args[]){
        math myMath =new math();
        for (int i=100;i<=999;i++){
            if (myMath.shuiXianHuaShu(i)==true){
                System.out.println(i);
            }
        }
    }
    static class math{
        public boolean shuiXianHuaShu(int x){
            int i=0,j=0,k=0;
            i=x/100;
            j=(x%100)/10;
            k=x%10;
            if (x==i*i*i+j*j*j+k*k*k){
                return true;
            }else {
                return false;
            }
        }
    }*/
}
