/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.binarytreefromparentarray.printTree;

/**
 *
 * @author oyo
 */
public class inorderandpostorder {
    
    static class Index { 
    int index; 
      }
    public static Tree getPreorderTreeUtil(int in[],int post[],int start,int end,Index index)
    {
        if(start>end)
            return null;
        Tree node = new Tree(post[index.index]);
        index.index--;
        if(start==end)
            return node;
        int inindex = search(in,start,end,node.data);
        node.right = getPreorderTreeUtil(in,post,inindex+1,end,index);
        
        node.left = getPreorderTreeUtil(in,post,start,inindex-1,index);
        return node;
        
    }
    public static int search(int a[],int l,int h,int key)
    {
        for(int i=l;i<h;i++)
            if(a[i]==key)
                return i;
        return -1;
    }
    public static Tree getPreorderTree(int in[],int post[],int n)
    {
        Index index = new Index();
        index.index=n-1;
        return getPreorderTreeUtil(in,post,0,n-1,index);
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] inorder = new int[n];
        for(int i=0;i<n;i++)
            inorder[i]=in.nextInt();
        int[] post = new int[n];
        for(int i=0;i<n;i++)
            post[i]=in.nextInt();
        Tree pre = null;
        pre = getPreorderTree(inorder,post,n);
        printTree(pre);
    }
}
