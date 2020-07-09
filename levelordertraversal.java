/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.TreeBasic.insert;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author oyo
 */
public class levelordertraversal {
    public static void levelordertraversal(rootNode root){
        int height = TreeBasic.heightOfTree(root);
        for(int i=1;i<=height;i++)
            printlevel(root,i);
        
    }
    public static void printlevel(rootNode root,int level){
        if(root == null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        printlevel(root.left,level-1);
        printlevel(root.right,level-1);
    }
    public static void levelordertraversalQueue(rootNode root){
        Queue<rootNode> queue = new LinkedList<rootNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            rootNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int t= in.nextInt();
            rootNode root = null;
            while(t-->0){
                int data= in.nextInt();
                root=insert(root,data);
            }
            
            levelordertraversalQueue(root);
    }
}
