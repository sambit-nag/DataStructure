package com.sam.datastructure.tree;

public class GenerateBinaryTree {

    public TreeNode buildTree(int pre[],int in[],int size){

        return buildTreeHelper(in,pre,0,size-1,0,size-1);
    }

    private TreeNode buildTreeHelper(int[] in, int[] pre, int ins, int inE, int preS, int prE) {
        if (ins >inE)
            return null;
        else {
            int rootData = pre[preS];
            int rootIndex = -1;

            for (int i = ins; i <= inE; i++) {
                if (in[i] == rootData) {
                    rootIndex = i;
                    break;
                }
            }
            int lPreS = preS + 1;
            int lInE = rootIndex - 1;
            int lInS = ins;

            int lPreE = lInE - lInS + lPreS;
            int rPreS = lPreE + 1;
            int rPreE = prE;
            int rInS = rootIndex + 1;
            int rInE = inE;

            TreeNode root = new TreeNode(rootData);
            root.leftChild = buildTreeHelper(in, pre, lInS, lInE, lPreS, lPreE);
            root.rightChild = buildTreeHelper(in, pre, rInS, rInE, rPreS, rPreE);

            return root;
        }
    }


    public TreeNode buildTreeWithPostInOrder(int pos[],int in[],int size){

        return buildTreeHelper1(pos,in,0,size-1,0,size-1);

    }

    private TreeNode buildTreeHelper1(int[] pos, int[] in, int poS, int poE, int inS, int inE) {
        if(poS>poE)
            return null;
        else{
            int rootData=pos[poE];
            int rootIndex=-1;

            for(int i=inS;i<=inE;i++){
                if(in[i]==rootData) {
                    rootIndex = i;
                    break;
                }
            }

            TreeNode root=new TreeNode(rootData);
            int lpoS=poS;
            int linS=inS;
            int linE=rootIndex-1;
            int lpoE=linE-linS+lpoS;

            int rpoS=lpoE+1;
            int rpoE=poE-1;
            int rinS=rootIndex+1;
            int rinE=inE;

            root.leftChild=buildTreeHelper1(pos,in,lpoS,lpoE,linS,linE);
            root.rightChild=buildTreeHelper1(pos,in,rpoS,rpoE,rinS,rinE);

            return root;
        }
    }
}
