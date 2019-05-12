package com.sam.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchElementInBinaryTree {

    public boolean searchElementRecursive(TreeNode root,int element){
        if ((int)root.data==element)
            return true;
        else {
            if (root.leftChild != null && root.rightChild != null) {
                if (searchElementRecursive(root.leftChild, element)
                        || searchElementRecursive(root.rightChild, element))
                    return true;
                else
                    return false;

            }
            else
                return false;
        }
    }

    public boolean searchElementIterative(TreeNode root, int element){
        Queue<TreeNode> queue=new LinkedList<>();
        int numOfNodes;
        queue.add(root);
        while(!queue.isEmpty()){
            numOfNodes=queue.size();
            TreeNode temp=queue.remove();
            if((int)temp.data==element)
                return true;
            while(numOfNodes>0){
                if(temp.leftChild!=null)
                    queue.add(temp.leftChild);
                if(temp.rightChild!=null)
                    queue.add(temp.rightChild);
                numOfNodes --;
            }

        }
        return false;

    }


}
