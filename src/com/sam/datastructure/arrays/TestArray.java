package com.sam.datastructure.arrays;

public class TestArray {

    public static void main(String[] args) {
        int n[]=new int[5];
        n[0]=10;
        n[1]=4;
        n[2]=6;
        n[3]=3;
        n[4]=8;
        SubArrayWithGivenSum subArrayWithGivenSum=new SubArrayWithGivenSum();
        subArrayWithGivenSum.getSubArray(n,13);
    }
}
