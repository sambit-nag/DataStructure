package com.sam.datastructure.tree;

public class TreeNode <T>{

    T data;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

   public TreeNode(T data){
       this.data=data;
    }

    public T getData() {
        return data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeafNode() {

       return rightChild==null?leftChild==null:false;
    }
}
