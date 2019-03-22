package com.sam.datastructure.tree;

import java.util.HashMap;
import java.util.Map;

public class MinimumDepthOfBinaryTree {

    public int findMinimumDepth(TreeNode root){

        if (root==null)
            return 0;
        else{
            int leftDepth=findMinimumDepth(root.leftChild)+1;
            int rightDepth=findMinimumDepth(root.rightChild)+1;

            return Math.min(leftDepth,rightDepth);
        }

    }

    public TreeNode findDeepestNode(TreeNode root){

        Map<TreeNode,Integer>nodeMap=new HashMap<>();


        if(root==null)
            return null;
        else{
           // TreeNode temp=
        }
        return null;
    }
}
