package com.sam.datastructure.sorting;

public class TestSorting {

    public static void main(String[] args) {

        /*int arr1[]={1,43,32,76,18,14,12};
        BubbleSort arraySort=new BubbleSort();
        int bubbleSortedArr[]=arraySort.bubblesort(arr1);
        arraySort.print(bubbleSortedArr);*/

        int arr2[]={1,43,32,76,18,14,12};
        SelectionSort arraySort2=new SelectionSort();
        int selectionSortedArr[]=arraySort2.selectionSort(arr2);
        arraySort2.print(selectionSortedArr);



    }
}
