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
import javacourse.LinkedLis.Node;
import static javacourse.plandlinkedlist.push;
public class sortlinkedlists {
    public static void sort(Node head){
        Node f=head;
        Node s=head.next;
        while(f!=null)
        {
            s=f.next;
            while(s!=null)
            {
                if(f.data>s.data)
                {
                    int temp=f.data;
                    f.data=s.data;
                    s.data=temp;
                }
                s=s.next;
            }
            f=f.next;
        }
    }
    public static Node sortmerge(Node l, Node r){
        Node result = null;
        if(l==null)
            return r;
        if(r==null)
            return l;
        if(l.data<r.data)
        {
            result=l;
            result.next =sortmerge(l.next,r);
            
            
        }
        else if(r.data<=l.data)
        {
            result =r;
            result.next= sortmerge(l,r.next);
        }
        
        return result;
    }
    public static Node mergesort(Node head){
        if(head==null || head.next== null)
            return head;
        Node middle = getMiddle(head);
        Node nextmiddle = middle.next;
        middle.next=null;
        Node left = mergesort(head);
        Node right = mergesort(nextmiddle);
        Node sortednode = sortmerge(left,right);
        return sortednode;
    }
    public static Node getMiddle(Node head){
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && head.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node head= null;
        for(int i=0;i<n;i++)
            head=push(head,in.nextInt());
        sort(head);
        print(head);
    }

    private static void print(Node head) {
        if(head==null)
            return;
        Node cur = head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
}
