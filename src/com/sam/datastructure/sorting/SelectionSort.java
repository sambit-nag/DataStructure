package com.sam.datastructure.sorting;

public class SelectionSort {

    public int[] selectionSort(int[]arr){


        for(int i=0;i<arr.length-2;i++){
            int lowestIndex=i;
            int temp;

            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    if(arr[j]<arr[lowestIndex])
                    lowestIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[lowestIndex];
            arr[lowestIndex]=temp;
        }
        return arr;
    }


    public void print(int[] sortedArr) {

        for(int i:sortedArr){
            System.out.print(i+" ");
        }
    }
}
