package com.sam.datastructure.stacks;

public class DoublyLinkedList<T> {

    Node head;
    int length;

    public void addNodeAtStart(T data){
        Node newNode=new Node<T>(data);

        Node temp=head;
        newNode.setNextNode(temp);
        newNode.setPrevNode(null);
        head =newNode;
        length=length+1;

    }


    public int getLength() {
        return length;
    }


    public void addAtPosition(int pos,T data){
        Node next;
        if(pos>getLength()){
            System.out.println("Linked list doesnt have that position to enter");
        }else {
            Node temp=head;
            for (int i = 1; i < pos-1; i++) {
                temp=temp.getNextNode();

            }
            Node<T> newNode=new Node<>(data);
            newNode.setNextNode(temp.getNextNode());
            newNode.setPrevNode(temp);
            temp.setNextNode(newNode);
            length=length+1;
        }
    }

}
