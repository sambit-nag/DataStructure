package com.sam.datastructure.tree;

public class ThreadedBinaryTree {

    static Node root;
    static Node current;
    static boolean directionRight = false;
    static boolean directionLeft = false;

    public static void main(String[] args) {

        // 1 . Create the root node which is gonna hold the checking conditions

        root = new Node(999);

        root.lBit = 0;
        root.rBit = 1;
        root.left = root.right = root;

        // 2 . Condition to add new roots!

        createNode(35);
        createNode(10);
        createNode(22);
        createNode(50);
        createNode(11);

        // 3 . PreOrder, InOrder and PostOrder printing

        System.out.println("Output for recursive inOrder!");
        inOrderRecursive(root.left);
        System.out.println();

        System.out.println("Output for recursive inOrder!");
        inOrder();
        System.out.println();

    }

    public static void inOrder() {

        current = root.left;

        while (current.lBit == 1) {

            current = current.left;

        }

        while(current != root){

            System.out.print(" -> " + current.data);
            current = nextInOrder(current);

        }

    }

    public static Node nextInOrder(Node next) {

        if(next.rBit == 0){

            return next.right;

        }

        next = next.right;

        while(next.lBit == 1){

            next = next.left;

        }

        return next;

    }

    public static void inOrderRecursive(Node temp) {

        if (temp != root) {

            if (temp.lBit != 0)
                inOrderRecursive(temp.left);

            System.out.print(temp.data + " -> ");

            if (temp.rBit != 0)
                inOrderRecursive(temp.right);

        }

    }

    public static void createNode(int data) {

        Node node = new Node(data);

        if (root.left == root && root.right == root) {

            node.lBit = root.lBit;
            node.left = root.left;
            root.left = node;
            root.lBit = 1;
            node.rBit = 0;
            node.right = root;

        } else {

            current = root.left;

            while (true) {

                if (node.data < current.data) {

                    if (current.lBit == 0) {

                        directionLeft = true;
                        directionRight = false;
                        break;

                    } else {

                        current = current.left;

                    }

                } else {

                    if (current.rBit == 0) {

                        directionLeft = false;
                        directionRight = true;
                        break;

                    } else {

                        current = current.right;

                    }

                }

            }

            if (directionLeft) {

                node.lBit = current.lBit;
                node.left = current.left;
                current.left = node;
                current.lBit = 1;
                node.rBit = 0;
                node.right = current;

            } else if (directionRight) {

                node.rBit = current.rBit;
                node.right = current.right;
                current.right = node;
                current.rBit = 1;
                node.lBit = 0;
                node.left = current;

            } else {

                System.out.println("Program is a fail!");

            }

        }

        System.out.println("Nodes added!");

    }

}

class Node {

    int data;

    Node left;
    Node right;

    int lBit;
    int rBit;

    Node(int data) {

        this.data = data;

    }

}