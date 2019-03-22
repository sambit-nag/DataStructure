package com.sam.datastructure;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

public class DataStreamExample {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream(new File("/Users/macbook/IdeaProjects/DataStructurePractise/src/com/sam/datastructure/abc.txt"));
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }


}