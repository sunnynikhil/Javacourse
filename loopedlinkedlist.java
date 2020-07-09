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
class BST{
    int data;
    BST left;
    BST right;
    BST(int d){
        this.data=d;
        left=right=null;
    }
}
public class loopedlinkedlist {
    
    public static BST sortedtoBST(int a[], int start,int end){
        if(start>end)
            return null;
        int mid = (start+end)/2;
        BST node = new BST(a[mid]);
        
        node.left=sortedtoBST(a,start,mid-1);
        node.right=sortedtoBST(a,mid+1,end);
        return node;
        
    }
    
    public static void print(BST head){
        if(head==null)
            return;
        
                   
        System.out.print(head.data+" ");
        print(head.left); 
        print(head.right);
        
        
    }
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        BST head=sortedtoBST(a,0,n-1);
        print(head);
        
    }
}
