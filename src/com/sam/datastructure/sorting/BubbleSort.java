package com.sam.datastructure.sorting;

public class BubbleSort {

public int[] bubblesort(int []arr){

    int length=arr.length;
    int temp;

    for(int i=0;i<length ;i++){
        for(int j=1;j<length;j++){

            if(arr[j-1]>arr[j]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }

        }
    }
    return arr;
}

    public void print(int[] sortedArr) {

        for(int i:sortedArr){
            System.out.print(i+"  ");
        }
    }
}
