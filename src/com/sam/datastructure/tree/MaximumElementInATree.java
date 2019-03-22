package com.sam.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumElementInATree {

    public int maxElementInABinaryTree(TreeNode root) {
        int maxNode = Integer.MIN_VALUE;

        if (root == null)
            return maxNode;
        else {
            int lmax = maxElementInABinaryTree(root.leftChild);
            int rmax = maxElementInABinaryTree(root.rightChild);

            maxNode = Math.max((int) root.data, Math.max(lmax, rmax));
        }

        return maxNode;

    }

    public int maxElementIterative(TreeNode root){

        int maxNode= Integer.MIN_VALUE;

        Queue<TreeNode> queueOfNodes=new LinkedList<>();
        queueOfNodes.add(root);
        int numOfNodes;

        while(!queueOfNodes.isEmpty()){
            numOfNodes=queueOfNodes.size();
            TreeNode temp=queueOfNodes.remove();
            if((int)temp.data>maxNode) {
                maxNode=(int)temp.data;
            }
            while(numOfNodes>0){
                if(temp.leftChild!=null)
                    queueOfNodes.add(temp.leftChild);

                if(temp.rightChild!=null)
                    queueOfNodes.add(temp.rightChild);
                numOfNodes--;
                }
            }

            return maxNode;

        }


}
