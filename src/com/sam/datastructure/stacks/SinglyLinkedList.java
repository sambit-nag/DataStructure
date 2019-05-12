package com.sam.datastructure.stacks;

import java.util.Stack;

public class SinglyLinkedList <T> {

    Node head;
    int length;

    public void addNodeAtStart(T data) {
        Node newNode = new Node<T>(data);

        Node temp = head;
        newNode.setNextNode(temp);
        head = newNode;
        length = length + 1;

    }

    public int getLength() {
        return length;
    }

    public void addAtPosition(int pos, T data) {
        Node next;
        if (pos > getLength()) {
            System.out.println("Linked list doesnt have that position to enter");
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getNextNode();

            }
            Node<T> newNode = new Node<>(data);
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
            length = length + 1;
        }
    }

    public void addAtEnd(T data) {
        Node temp = head;
        while (temp.getNextNode() != null) {
            temp = temp.getNextNode();

        }
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(null);
        temp.setNextNode(newNode);
        length = length + 1;

    }

    public void deleteFromStart() {
        Node temp = head;
        head = head.getNextNode();
        temp = null;
        length = length - 1;
    }

    public void deleteFromPosition(int pos) {
        Node next;
        if (pos > getLength()) {
            System.out.println("Linked list doesnt have that position to delete");
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getNextNode();

            }

            temp.setNextNode(temp.getNextNode().getNextNode());
            length = length - 1;
        }
    }

    public void searchElement(T data) {
        Node temp = head.getNextNode();
        while (temp != null) {
            if (temp.getData() == data) {
                System.out.println("Element found");
                break;
            } else {
                temp = temp.getNextNode();
                if (temp == null)
                    System.out.println("Element not found");
            }
        }


    }

    public T getNthNodeFromEnd(int n) {


        Node temp = head;
        Stack nodeStack = new Stack();

        while (temp != null) {
            nodeStack.push(temp.getData());
            temp = temp.getNextNode();
        }

        for (int i = 1; i < n; i++) {
            nodeStack.pop();


        }
        return (T) nodeStack.pop();
    }

    public T getNthNodeFromEndUsingPointer(int n) {
        Node nthNode = head;
        Node temp = head;

        for (int i = 0; i < n; i++) {
            temp = temp.getNextNode();
        }

        while (temp != null) {
            nthNode = nthNode.getNextNode();
            temp = temp.getNextNode();
        }

        return (T) nthNode.getData();
    }

    public T getNthNodeFromEndUsingPoint(int n) {
        Node nthNode = head;
        Node temp = head;
        int i=1;

        while(temp!=null){

        if(i<=n){

            temp=temp.getNextNode();
            i++;

        }else{
            nthNode=nthNode.getNextNode();
            temp=temp.getNextNode();


        }

        }

        return (T) nthNode.getData();
    }
    public T getNthNodeFromEndUsingRecursion(Node head, int n) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            getNthNodeFromEndUsingRecursion(temp.getNextNode(), n);
            count++;

            if (count == n)
                return (T) temp.getData();
        }

        return null;
    }

    public void swapNodes(int a, int b) {
        Node x = head;
        Node y = head;
        T c, d;


        for (int i = 1; i < a - 1; i++) {
            x = x.getNextNode();
        }

        for (int i = 1; i < b - 1; i++) {
            y = y.getNextNode();
        }

        c = (T) y.getData();
        d = (T) x.getData();
        x.setData(c);
        y.setData(d);
    }

    public Node<Integer> mergeSortedList(Node head1, Node head2) {

        if (head1 == null)
            return head2;
        else if (head2 == null)
            return head1;
        else {
            Node<Integer> newNode = new Node(null);
            if ((Integer) head1.getData() > (Integer) head2.getData()) {
                head = head2;
                head.nextNode = mergeSortedList(head1, head2.nextNode);
            } else {
                head = head1;
                head.nextNode = mergeSortedList(head1.nextNode, head2);
            }
        }

        return head;
    }

    public Node<T> reverseLinkedListInPairs(Node head) {
        Node current = head;
        Node temp = null;
        Node newHead = null;

        while (current != null && current.nextNode != null) {

            if (temp != null)
                temp.nextNode.nextNode = current.nextNode;

            temp = current.nextNode;
            current.nextNode = temp.nextNode;
            temp.nextNode = current;

            if (newHead == null)
                newHead = temp;
            current = current.nextNode;


            return newHead;


        }

        return null;
    }


    public Node<T> reverseLinkedList(Node head) {

        Node temp = head;
        Node abc = null;
        Node nextTemp=temp.nextNode;
        while (temp != null && nextTemp!=null) {
            temp.nextNode = abc;
            abc = temp;
            temp=nextTemp;
            nextTemp=nextTemp.nextNode;


        }

        return temp;
    }
}
