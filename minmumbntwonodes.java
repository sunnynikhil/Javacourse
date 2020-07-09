/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.issumproperty.issumproperty;

/**
 *
 * @author oyo
 */
public class minmumbntwonodes {
    public static Tree findlca(Tree root,int n1,int n2){
        if(root==null)
            return root;
        if(root.data==n1 || root.data==n2)
            return root;
        Tree left = findlca(root.left,n1,n2);
        Tree right = findlca(root.right,n1,n2);
        if(left!=null && right!=null)
            return root;
        if(left!=null)
            return findlca(root.left,n1,n2);
        else
            return findlca(root.right,n1,n2);
        
    } 
   
    public static int minimumdist(Tree root,int n1,int n2){
        Tree lca = findlca(root,n1,n2);
        
        int d1 = findlevel(lca,n1,0);
        int d2 = findlevel(lca,n2,0);
        
        
        return d1+d2;
    }
    public static int findlevel(Tree root,int n,int level){
        if(root==null)
            return -1;
        if(root.data==n)
            return level;
        int left=findlevel(root.left,n,level+1);
        if(left==-1)
            return findlevel(root.right,n,level+1);
        return left;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root  = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.print(minimumdist(root,n1,n2));
    }
}
