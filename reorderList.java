/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.push;
import static javacourse.reversekgroup.printlist;

/**
 *
 * @author oyo
 */
public class reorderList {
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
    public static void merge(list head,list middle)
    {
        list next=null, prev=null;
        list cur= head;
        while(cur!=null && middle!=null)
        {
            next=cur.next;
            prev=middle.next;
            cur.next=middle;
            middle.next=next;
            middle=prev;
            cur=next;
            
        }

        
    }
    public static list reverse(list head)
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
    public static list reorder(list head)
    {
        list middle= getMiddle(head);
        list nextMiddle = middle.next;
        middle.next=null;
        nextMiddle=reverse(nextMiddle);
        merge(head,nextMiddle);
        return head;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list head = null;
        for(int i=0;i<n;i++)
            head=push(head,in.nextInt());
        
        head=reorder(head);
        printlist(head);
    }
}
