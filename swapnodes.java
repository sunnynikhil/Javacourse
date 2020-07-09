/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.print;
import static javacourse.removeNthNodefromend.push;
import static javacourse.removeNthNodefromend.removeNthNode;

/**
 *
 * @author oyo
 */
public class swapnodes {
    public static list swap(list head)
    {
        
        
        if(head.next==null || head==null)
            return head;
        list cur=head.next.next,next=null,prev=head,nextnext=null;
        head=head.next;
        head.next=prev;
        while(cur.next!=null && cur!=null)
        {
            System.out.print(cur.data+"->");
            
           prev.next=cur.next;
           prev=cur;
           next=cur.next.next;
           cur.next.next=cur;
           cur=next;
        }
        prev.next=cur;
        return head;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            list head = null;
            for(int i=0;i<n;i++)
                head=push(head,in.nextInt());
            head=swap(head);
            System.out.println();
            print(head);
        
        }
        
    }
}
