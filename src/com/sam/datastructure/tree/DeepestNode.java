package com.sam.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {


    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode current=null;
        int queueSize=0;
        int depth=0;
        queue.add(root);
        while(!queue.isEmpty()){

            queueSize=queue.size();

            if(queueSize==0)
                return depth;
            depth++;

            while(queueSize>0){
                current=queue.remove();
                if(current.leftChild!=null)
                    queue.add(current.leftChild);

                if(current.rightChild!=null)
                    queue.add(current.rightChild);
                queueSize--;
            }
        }


    return depth;


    }


}
