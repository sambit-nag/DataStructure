package com.sam.datastructure.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList=new SinglyLinkedList<>();
        singlyLinkedList.addNodeAtStart(10);
        singlyLinkedList.addNodeAtStart(20);
        singlyLinkedList.addNodeAtStart(30);
        singlyLinkedList.addNodeAtStart(40);
        singlyLinkedList.addNodeAtStart(50);
        singlyLinkedList.addNodeAtStart(60);
        singlyLinkedList.addAtPosition(4,90);
        singlyLinkedList.addAtEnd(45);
       // singlyLinkedList.deleteFromPosition(86);
       // singlyLinkedList.deleteFromStart();
        singlyLinkedList.searchElement(0);
        System.out.println(singlyLinkedList.getNthNodeFromEnd(5));
        System.out.println(singlyLinkedList.getNthNodeFromEndUsingPointer(6));

        Node a=new Node(10);
        Node b=new Node(20);a.setNextNode(b);
        Node c=new Node(30);b.setNextNode(c);
        Node d=new Node(40);c.setNextNode(d);
        Node e=new Node(50);d.setNextNode(e);
        Node f=new Node(60);e.setNextNode(f);
        Node g=new Node(70);f.setNextNode(g);
        Node h=new Node(80);g.setNextNode(h);
        Node i =singlyLinkedList.reverseLinkedList(a);

        System.out.println(singlyLinkedList.getNthNodeFromEndUsingRecursion(a,6));
        singlyLinkedList.swapNodes(3,5);



        DoublyLinkedList<Integer> doublyLinkedList=new DoublyLinkedList<>();
        singlyLinkedList.swapNodes(3,5);

        doublyLinkedList.addNodeAtStart(10);
        doublyLinkedList.addNodeAtStart(20);
        doublyLinkedList.addNodeAtStart(30);
        doublyLinkedList.addNodeAtStart(40);
        doublyLinkedList.addNodeAtStart(50);
        doublyLinkedList.addNodeAtStart(60);
        doublyLinkedList.addAtPosition(2,70);
        doublyLinkedList.addAtPosition(3,80);


        int abc=10000;
        int bed=abc;
         bed=bed+10;

        System.out.println(abc);

        Map<Integer,Integer> nodeStack=new HashMap<>();
    }
}
