package com.sam.datastructure.stacks;

public class StackUsingDynamicArray {

        int capacity=4;
        int top=-1;
        int[]arr=new int[capacity];


        public boolean isEmpty(){

            return top<0;
        }

        public void push(int element){
            if(top ==arr.length-1) {
                System.out.println("Stack is full resizing");
                resize();

            }
                top =top+1;
                arr[top]=element;


        }
        public void resize(){
            capacity=capacity*2;
            int resizedArr[]=new int[capacity];
            for(int i=0;i<=top;i++){
                resizedArr[i]=arr[i];
            }
            arr=resizedArr;
        }

        public int pop(){
            if (top==-1) {
                System.out.println("Stack is empty");
                return top;
            }else{
                int poppedElement=arr[top];
                arr[top]=0;
                top=top-1;
                return poppedElement;
            }

        }

        public void displayStack() {
        if(top==-1){
            System.out.println("Stack is empty");
            }
            else{
                String brace = "{";

                if (arr.length == 1) {
                    brace = brace + arr[0];
                } else {
                    for (int i = 0; i < top; i++) {
                        brace = brace + arr[i] + ", ";
                    }
                }
                System.out.println(brace + arr[top] + "}");

            }
        }


}
