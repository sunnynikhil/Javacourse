/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */import java.util.*;
public class binarytreefromparentarray {
   static  Tree root;
    public static void printTree(Tree root){
        if(root==null)
            return;
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
    public static void createTree(int a[],int i , Tree created[] ){
        
        if(created[i]!=null)
            return;
        created[i] = new Tree(i);
        if(a[i]==-1)
        {
            root=created[i];
            return;
            
        }
        if(created[a[i]]==null)
            createTree(a,a[i],created);
        Tree p = created[a[i]];
        if(p.left==null)
            p.left=created[i];
        else
            p.right=created[i];
    }
    public static Tree contructTree(int a[],int n){
        Tree[] created = new Tree[n];
        for(int i=0;i<n;i++)
            created[i]=null;
        for(int i=0;i<n;i++)
            createTree(a,i,created);
        return root;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        Tree node = contructTree(a,n);
        printTree(node);
    }
}
