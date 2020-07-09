/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.minDepth.minDepth;
import static javacourse.minimumsumlist.push;
import static javacourse.reversekgroup.printlist;

/**
 *
 * @author oyo
 */
public class megresortlinkedlist1 {
    public static list getMiddle(list root)
    {
        if(root==null)
            return root;
        list slow = root,fast=root;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
       
    }
    public static list mergeLists(list a,list b)
    {
        if(a==null &&b==null)
            return null;
        if(a==null)
            return b;
        if(b==null)
            return a;
        list result=null;
        if(a.data<b.data)
        {
             result =a;
            result.next=mergeLists(a.next,b);
            
        }
        else
        {result =b;
            result.next=mergeLists(a,b.next);
            
        }
        return result;
    }
    public static list mergeSort(list root)
    {
        if(root==null || root.next==null)
            return root;
         list middle = getMiddle(root);
         list nextofmiddle = middle.next;
         middle.next=null;
         list left = mergeSort(root);
         list right = mergeSort(nextofmiddle);
         
         list sortlist = mergeLists(left,right);
                 
         return sortlist;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        root=mergeSort(root) ;
        printlist(root);
        
        
    }
}
