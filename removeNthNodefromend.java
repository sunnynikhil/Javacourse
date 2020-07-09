/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.print;

/**
 *
 * @author oyo
 */
public class removeNthNodefromend {
    public static list push(list node,int data){
        if(node==null)
            return new list(data);
        else
        {
            list new_node = new list(data);
            new_node.next=node;
            return new_node;
                    
        }
    }
    public static int getLength(list head)
    {
        int length=0;
        list cur=head;
        while(cur!=null)
        {
            length++;
            cur=cur.next;
        }
        return length;
    }
    public static list removeNthNode(list head,int k)
    {
        int len=getLength(head);
        int count=len-k;
        list cur=head,prev=null;
        while(cur!=null&&count>0)
        {
            prev=cur;
            cur=cur.next;
            count--;
        }
        if(prev==null)
            return cur.next;
        else if(cur==null)
            prev=null;
        else 
           prev.next=cur.next;
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
            int k = in.nextInt();
            head=removeNthNode(head,k);
            print(head);
        
        }
        
    }
}
