/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
import static javacourse.deleteBST.print;

public class constBST {
    public static Tree bulidBST(Tree root,int data){
        if(root==null)
            return new Tree(data);
        if(root.data>data)
            root.left=bulidBST(root.left,data);
        else
        {
            root.right = bulidBST(root.right,data);
        }
        return root;
    }
    public static Tree construct(Tree root,int pre[]){
        for(int i=0;i<pre.length;i++)
            root=bulidBST(root,pre[i]);
        return root;
    }
    
    public static int constructBST(Tree root,int pre[],int n,int pos,int min,int max){
    if(pos==n || pre[pos]>max || pre[pos]<min)
        return pos;
    if(pre[pos]<root.data){
        root.left = new Tree(pre[pos]);
        pos+=1;
        pos=constructBST(root.left,pre,n,pos,min,root.data-1);
    }
    if(pos==n || pre[pos]>max || pre[pos]<min)
        return pos;
        
    root.right = new Tree(pre[pos]);
    pos+=1;
    pos=constructBST(root.right,pre,n,pos,root.data+1,max);
    return pos;
    }
    
    public static Tree constTree(int pre[]){
        int n = pre.length;
        if(n==0)
            return null;
       Tree root = new Tree(pre[0]);
        if(n==1)
            return root;
        
        constructBST(root,pre,n,1,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return root;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pre[] = new int[n];
        for(int i=0;i<n;i++)
            pre[i]=in.nextInt();
        
        Tree root=constTree(pre);
        print(root);
    }
}
