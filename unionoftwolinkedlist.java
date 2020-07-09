/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import java.util.TreeSet;
import static javacourse.minimumsumlist.push;
import static javacourse.reversekgroup.printlist;

/**
 *
 * @author oyo
 */
public class unionoftwolinkedlist {
    public static list getMiddle(list head)
    {
        list slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
        
    }
    public static list mergeSort(list head)
    {
        if(head==null || head.next==null)
            return head;
        list middle=getMiddle(head);
        list middlenext = middle.next;
        middle.next=null;
        list left = mergeSort(head);
        list right = mergeSort(middlenext);
        list sortlist = mergeList(left,right);
        return sortlist;
        
    }
    public static list mergeList(list a,list b)
    {
        if(a==null && b==null)
            return null;
        if(a==null)
            return b;
        if(b==null)
            return a;
        list result=null;
        if(a.data<b.data)
        {
            result=a;
            result.next=mergeList(a.next,b);
        }
        else if(a.data>b.data)
        {
            result=b;
            result.next=(mergeList(a,b.next));
        }
        else
        {
           
            result=b; 
            result.next=mergeList(a.next,b.next);
        }
        return result;
    }
    public static list union(list l1,list l2)
    {
       l1=mergeSort(l1);
       l2=mergeSort(l2);
       System.out.println("list1");
       printlist(l1);
       System.out.println("list2");
       printlist(l2);
       list l3 = null;
       while(l1!=null && l2!=null)
       {
           if(l1.data<l2.data)
           {
               l3=(push(l3,l1.data));
               l1=l1.next;
           }
           else if(l1.data>l2.data)
           {
               l3=push(l3,l2.data);
               l2=l2.next;
           }
           else
           {
               l3=push(l3,l2.data);
               l1=l1.next;
               l2=l2.next;
           }
           
       }
       while(l1!=null)
       {
            l3=(push(l3,l1.data));
               l1=l1.next;
       }
       while(l2!=null)
       {
           l3=push(l3,l2.data);
               l2=l2.next;
           
       }
       return reverse(l3);
        
    }
    public  static list reverse(list head)
    {
        list prev=null,next=null,cur=head;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list l1 = null;
        list l2 =  null;
        
        for(int i=0;i<n;i++)
            l1=push(l1,in.nextInt());
        int m = in.nextInt();
        for(int i=0;i<m;i++)
            l2=push(l2,in.nextInt());
        list l3 = union(l1,l2);
        printlist(l3);
            
    }
}
