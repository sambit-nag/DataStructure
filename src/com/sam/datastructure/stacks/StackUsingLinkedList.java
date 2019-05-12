package com.sam.datastructure.stacks;

import java.util.LinkedList;

public class StackUsingLinkedList {

    LinkedList<Integer> stackLL=new LinkedList();

    public void push(int element){
        stackLL.add(element);
    }

    public int pop(){

        return stackLL.pop();

    }
}

