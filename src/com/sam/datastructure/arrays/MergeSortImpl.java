package com.sam.datastructure.arrays;

public class MergeSortImpl {

    private static int[] mergeSort(int[]a){

        if(a.length==0)
            return a;
        else{

            int []b=split(a,0,a.length/2);
            int []c=split(a,a.length/2,a.length);
           // return merge(mergeSort(b),mergeSort(c));
        }
return null;

    }



    private static int[] split(int[] a, int start,int end) {
        int []temp=new int[end-start-1];

        for(int i=start;i<end;i++){
            temp[i]=a[i];
        }
        return temp;
    }
}
