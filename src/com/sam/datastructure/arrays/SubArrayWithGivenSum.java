package com.sam.datastructure.arrays;

import com.sun.tools.javac.util.Pair;

public class SubArrayWithGivenSum {

    public Pair<Integer,Integer> getSubArray(int [] baseArray, int n){

        int startIndex=0;
        int endIndex=1;
        int sum;

            while (endIndex < baseArray.length&& endIndex>=startIndex) {

                if (checksum(startIndex, endIndex, baseArray) == n)
                    break;
                else if(startIndex==endIndex)
                    endIndex=endIndex+1;
                else if (checksum(startIndex, endIndex, baseArray) < n) {
                    endIndex = endIndex + 1;
                } else {
                    startIndex = startIndex + 1;
                }
            }
            return new Pair<>(startIndex, endIndex);


        }

    private int checksum(int startIndex, int endIndex, int[] baseArray) {

        int sum=0;

        for(int i=startIndex;i<=endIndex;i++){
            sum=sum+baseArray[i];
    }
    return sum;
}
}
