package com.sam.datastructure.stacks;

public class Node<T> {

    T data;
    Node nextNode;
    Node prevNode;


    public Node(T data){
        this.data=data;

    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public T getData() {
        return data;
    }


    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
