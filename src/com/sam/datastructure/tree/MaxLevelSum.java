package com.sam.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {


    public  int maxLevelSum(TreeNode root)
    {
        Queue<TreeNode> nodeQ=new LinkedList();
        nodeQ.add(root);
        int maxSum=0;
        while(!nodeQ.isEmpty()){
            int queueSize=nodeQ.size();
            int levelSum=0;
            while(queueSize>0){
                TreeNode currNode=nodeQ.remove();
                levelSum=levelSum + (int)currNode.data;
                if(currNode.leftChild!=null)
                    nodeQ.add(currNode.leftChild);
                if(currNode.rightChild!=null)
                    nodeQ.add(currNode.rightChild);

                queueSize--;

            }
            maxSum=Math.max(maxSum,levelSum);


        }
        return maxSum;

    }
}

