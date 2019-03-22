package com.sam.datastructure.arrays;

public class MergeSortedArrays {

    private static int[] mergeSortedArrays(int []a,int[]b){
        int j=a.length-b.length-1;
        int index=a.length-1;
        int i=b.length-1;


        while(true){

            if(i<0||j<0)
                break;

            if(a[j]>b[i]){
                a[index]=a[j];
                a[j]=0;
                j--;
                index--;
            }else{
                a[index]=b[i];
                i--;
                index--;
            }

        }


        return a;
    }

    public static void main(String[] args) {

        int a[]=new int[10];
        int b[]=new int[5];
        a[0]=1;
        a[1]=3;
        a[2]=5;
        a[3]=9;
        a[4]=13;
        b[0]=2;
        b[1]=6;
        b[2]=10;
        b[3]=11;
        b[4]=17;

        System.out.println(mergeSortedArrays(a,b));


    }
}
