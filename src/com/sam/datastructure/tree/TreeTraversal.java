package com.sam.datastructure.tree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

    public void preOrderTraversalRecursion(TreeNode root){

        if(root!=null){
            System.out.println(root.getData());
            preOrderTraversalRecursion(root.leftChild);
            preOrderTraversalRecursion(root.rightChild);
        }
    }

    public ArrayList<Integer> preOrderTraveralIterative(TreeNode root){
        ArrayList<Integer> arrayList=new ArrayList<>();
        Stack<TreeNode> stackOfNodes=new Stack<>();

        if(root==null)
            return null;
        else
            stackOfNodes.push(root);
        while(!stackOfNodes.isEmpty()){
            TreeNode tmp=stackOfNodes.pop();
            arrayList.add((Integer) tmp.data);

            if(tmp.rightChild!=null){
                stackOfNodes.push(tmp.rightChild);
            }
            if(tmp.leftChild!=null){
                stackOfNodes.push(tmp.leftChild);
            }
        }

        return arrayList;
    }

    public ArrayList<Integer> postOrderTraveralIterative(TreeNode root){

        ArrayList<Integer>arrayOfData=new ArrayList<>();
        Stack<TreeNode> stackOfNodes=new Stack<>();
        stackOfNodes.push(root);

        while(!stackOfNodes.isEmpty()){

            TreeNode currentNode=stackOfNodes.peek();

            if(currentNode.isLeafNode()){

                arrayOfData.add((Integer) stackOfNodes.pop().data);

            }else{
                if(currentNode.rightChild!=null){
                    stackOfNodes.push(currentNode.rightChild);
                    currentNode.rightChild=null;
                }
                if(currentNode.leftChild!=null){
                    stackOfNodes.push(currentNode.leftChild);
                    currentNode.leftChild=null;
                }
            }

        }

        return arrayOfData;

    }

    public ArrayList<Integer> levelOrderTraveralIterative(TreeNode root){
        int nodeCount=0;
        Queue<TreeNode> nodeQueue=new LinkedList<>();
        ArrayList<Integer> listOfData=new ArrayList<>();

        nodeQueue.add(root);
        while(true){

            nodeCount=nodeQueue.size();
            if(nodeCount==0)
                break;
            while(nodeCount>0){
                TreeNode node=nodeQueue.peek();
                listOfData.add((Integer)nodeQueue.remove().data);
                if(node.leftChild!=null)
                    nodeQueue.add(node.leftChild);
                if(node.rightChild!=null)
                    nodeQueue.add(node.rightChild);
                nodeCount--;
            }


        }


        return listOfData;

    }

    public ArrayList<Integer> inOrderTraveralIterative(TreeNode root) {

        ArrayList<Integer>arrayOfData=new ArrayList<>();
        Stack<TreeNode> stackOfNodes=new Stack<>();
        TreeNode currentNode=root;

        while(true){
            if(currentNode!=null){
                stackOfNodes.push(currentNode);
                currentNode=currentNode.leftChild;

            }else{
                if(stackOfNodes.isEmpty())
                    break;
                else{
                    currentNode=stackOfNodes.pop();
                    arrayOfData.add((Integer) currentNode.data);
                    //if(currentNode.rightChild!=null)
                    currentNode=currentNode.rightChild;
                }
            }
        }


        return arrayOfData;
    }



        public static void main(String[] args) {
        TreeNode<Integer> node1=new TreeNode<>(10);
        TreeNode<Integer> node2=new TreeNode<>(20);
        TreeNode<Integer> node3=new TreeNode<>(30);
        TreeNode<Integer> node4=new TreeNode<>(40);
        TreeNode<Integer> node5=new TreeNode<>(50);
        TreeNode<Integer> node6=new TreeNode<>(60);
        TreeNode<Integer> node7=new TreeNode<>(70);
        TreeNode<Integer> node8=new TreeNode<>(80);

        node1.leftChild=node2;
        node1.rightChild=node3;
        node2.leftChild=node4;
        node2.rightChild=node5;
        node3.leftChild=node6;
        node3.rightChild=node7;
        node4.leftChild=node8;

        //TreeTraversal treeTraversal=new TreeTraversal();
        //treeTraversal.inOrderTraveralIterative(node1);

            DeepestNode maxDepthBinaryTree=new DeepestNode();
            System.out.println(maxDepthBinaryTree.maxDepth(node1));

            MaximumElementInATree maximumElementInATree=new MaximumElementInATree();
            int max=maximumElementInATree.maxElementIterative(node1);

            System.out.println(max);

            SearchElementInBinaryTree searchElementInBinaryTree=new SearchElementInBinaryTree();
            System.out.println(searchElementInBinaryTree.searchElementRecursive(node1,0));
            System.out.println(searchElementInBinaryTree.searchElementIterative(node1,90));

            int pre[]={1,2,4,5,3,6,7};
            int in[]={4,2,5,1,6,3,7};
            int po[]={4,5,2,6,7,3,1};

            GenerateBinaryTree generateBinaryTree=new GenerateBinaryTree();
            TreeNode tree=generateBinaryTree.buildTree(pre,in,7);
            TreeNode temp=generateBinaryTree.buildTreeWithPostInOrder(po,in,7);
            printTree(tree);
            MinimumDepthOfBinaryTree minimumDepthOfBinaryTree=new MinimumDepthOfBinaryTree();
            int depth=minimumDepthOfBinaryTree.findMinimumDepth(node1);
            System.out.println(depth);

            MaxLevelSum maxLevelSum=new MaxLevelSum();
            System.out.println(maxLevelSum.maxLevelSum(node1));



    }

    private static void printTree(TreeNode tree) {


    }


}
