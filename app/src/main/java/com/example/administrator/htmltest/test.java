package com.example.administrator.htmltest;

/**
 * Created by Administrator on 2017/9/20.
 */

public class test {


    /**
     *
     * 冒泡排序
     * 比较相邻的两个数，如果顺序不正确就交换位置
     * @param array
     */
    public static void bubbleSort(int[] array){

        int temp;
        int size=array.length;
        for(int i=0;i<size-1;i++){//除了最后一个数其他都要比较（因为最小的数会冒泡到第一个,外层控制循环多少趟
            for (int j=0;j<size-1-i;j++){//找到的就不用再找了,内层控制每一趟的循环次数
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     *  选择排序：比如在一个长度为N的无序数组中，在第一趟遍历N个数据，
     *  找出其中最小的数值与第一个元素交换，第二趟遍历剩下的N-1个数据，
     *  找出其中最小的数值与第二个元素交换......第N-1趟遍历剩下的2个数据，
     *  找出其中最小的数值与第N-1个元素交换，至此选择排序完成。
     * @param array
     */

    public static void selectSort(int[] array){
       if (array == null|| array.length<=0){
           return;
       }

       for (int i=0;i<array.length;i++){
           int min=i;//将当前下标定义为最小值下标

           for (int j=i+1;j<array.length;j++ ){
               if (array[min]>array[j]){/* 如果有小于当前最小值的关键字 */
                   min= j; /* 将此关键字的下标赋值给min */
               }
           }

           if (array[i]!=array[min]){/* 若min不等于i，说明找到最小值，交换 */
               int temp =array[min];
               array[min]=array[i];
               array[i]=temp;

           }

       }

    }

    public static void printArr(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+",");
           // System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10,20,15,0,6,7,2,1,-5,55};
        System.out.println("排序前:");
        printArr(array);

        bubbleSort(array);
        System.out.println("冒泡排序后：");
        printArr(array);

        selectSort(array);
        System.out.println("选择排序后：");
        printArr(array);
    }

}
