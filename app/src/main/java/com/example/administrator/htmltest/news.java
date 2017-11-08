package com.example.administrator.htmltest;

/**
 * Created by Administrator on 2017/9/28.
 */

public class news {


    public static void main(String[] args){
        int[] array = {10,20,15,0,6,7,2,1,-5,55};
        bubbleSort(array);
        printArray(array);

        selectSort(array);
        printArray(array);


    }

    public static void bubbleSort(int[] array){
        int temp;
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j< array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void selectSort(int[] array){
        if (array==null||array.length<=0){
            return;
        }

        for (int i=0;i<array.length;i++){
            int min=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[min]){
                    min=j;
                }
            }
            if (array[i]!=array[min]){
                int temp =array[min];
                array[min]=array[i];
                array[i]=temp;
            }

        }


    }


    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+",");

        }

    }
}
