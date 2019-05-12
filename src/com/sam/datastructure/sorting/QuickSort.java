package com.sam.datastructure.sorting;

import java.util.Arrays;

public class QuickSort {

    private void sort(int []arr){
        QuickSort(arr,0,arr.length-1);
    }


    private void QuickSort(int[] arr,int startIndex,int endIndex){
        if(startIndex<endIndex){
            int pivot=pivotCalculator(arr,startIndex,endIndex);
             QuickSort(arr,startIndex,pivot-1);
             QuickSort(arr,pivot+1,endIndex);


        }
    }

    private int pivotCalculator(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = startIndex;
        for (int j = startIndex; j <= endIndex - 1; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

            }

        }
        arr[endIndex] = arr[i];
        arr[i] = pivot;
        return i;

    }

    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        int a[]= {25,5,7,2,18,23,12,18};
        quickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}



