/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author oyo
 */

class listnode{
    int data;
    listnode next;
    listnode(int data)
    {
        this.data=data;
        next = null;
    }
}
public class mergeksortlists {
    
    public static listnode mergeKSortedLists(listnode[] lists)
    {
        int n = lists.length;
        PriorityQueue<listnode> pq = new PriorityQueue<>(new Comparator<listnode>()
        {
            public int compare(listnode a,listnode b)
            {
                return a.data-b.data;
            }
        });
        listnode head=null,last=null;
        for(int i=0;i<n;i++)
            pq.add(lists[i]);
        while(!pq.isEmpty())
        {
            listnode top=pq.peek();
            pq.remove();
            if(top.next!=null)
                pq.add(top.next);
            if(head==null)
            {
                head=top;
                last=top;
            }
            else
            {
                last.next=top;
                last=top;
            }
        }
        return head;
    }
    public static void printList(listnode head)
    {
        listnode cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        listnode[] arr = new listnode[n];
        arr[0] = new listnode(1); 
        arr[0].next = new listnode(3); 
        arr[0].next.next = new listnode(5); 
        arr[0].next.next.next = new listnode(7); 
  
        arr[1] = new listnode(2); 
        arr[1].next = new listnode(4); 
        arr[1].next.next = new listnode(6); 
        arr[1].next.next.next = new listnode(8); 
  
        arr[2] = new listnode(0); 
        arr[2].next = new listnode(9); 
        arr[2].next.next = new listnode(10); 
        arr[2].next.next.next = new listnode(11); 
  
        // Merge all lists 
        listnode head = mergeKSortedLists(arr); 
        printList(head);
    }
}
