package com.sam.datastructure.stacks;

public class TestWhile {

    public static void main(String[] args) {
        String i="16";
        int id=Integer.parseInt(i);

        while(id!=0){
            int digit=id%10;
            System.out.println(digit);
            id=id/10;
        }
    }
}
