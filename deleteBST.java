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
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int d){
        this.data=d;
        left=null;
        right = null;
    }
}
public class deleteBST {
    
    public static Tree insert(Tree root, int data){
        if(root==null)
            return new Tree(data);
        else
        {
            Tree cur = null;
            if(data<root.data)
            {
                cur=insert(root.left,data);
                root.left=cur;
            }
            else if(data >= root.data){
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void print(Tree root){
        if(root==null)
            return;
       
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
    
    public static Tree deleteKey(Tree root , int key){
        
        if(root==null)
            return root;
        
        if(key<root.data)
            root.left=deleteKey(root.left,key);
        else if (key>root.data)
            root.right=deleteKey(root.right,key);
        else
        {
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
            
            root.data = minval(root.right);
            root.right = deleteKey(root.right,root.data);
        }
        
        return root;
    }
    public static int minval(Tree root){
        int minv = root.data;
        while(root.left!=null){
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }
    public static void delete(Tree root,int key){
        root = deleteKey(root,key);
    }
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
        {
            root = insert(root,in.nextInt());
        }
        
        int d = in.nextInt();
        delete(root,d);
        print(root);
        
    }
    
}
