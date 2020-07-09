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

class sumnode{
    int data;
    sumnode left;
    sumnode right;
    sumnode(int d){
        this.data = d;
        left=null;
        right = null;
    }
}
public class sumofroot {
    public static sumnode insert(sumnode root,int data){
        if(root == null)
            return new sumnode(data);
        else 
        {
            sumnode cur= root;
            if(data>root.data)
            {
                cur=insert(root.right,data);
                root.right=cur;
            }
            else
            {
                cur=insert(root.left,data);
                root.left = cur;
            }
            return root;
        }
        
    }
    public static boolean sum(sumnode root, int sum){
        if(root==null)
            return sum==0;
        return sum(root.left,sum-root.data)||sum(root.right,sum-root.data);
        
    }
    
    public static void printsum(sumnode root){
        if (root == null)
            return;
        printsum(root.left);
        System.out.print(root.data+" ");
        printsum(root.right);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sumnode tree = null;
        for(int i=0;i<n;i++)
            tree=insert(tree,in.nextInt());
        printsum(tree);
        int sum = in.nextInt();
        boolean f = sum(tree,sum);
        if(f==false){
            System.out.println(0);
        }
        else
            System.out.println(1);
    }
}
