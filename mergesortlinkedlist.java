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
public class mergesortlinkedlist {
    
    public static Node reverse(Node root){
        Node cur=root;
        Node next=null;
        Node pre = null;
        if(root==null)
            return null;
        while(cur!=null){
            next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
    public static Node mergelist(Node a,Node b){
        if(a==null) return b;
        if(b==null)return a;
                        
        if(a.data>=b.data){
            a.next = mergelist(a.next,b);
            return a;
        }   
        else{
            b.next=mergelist(a,b.next);
            return b;
        }
    }
    public static void print(Node head){
        if(head==null)
            return ;
        Node cur = head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Node head1 = null;
        Node head2 = null;
        int n1 = in.nextInt();
        for(int i=0;i<n1;i++)
            head1=push(head1,in.nextInt());
        int n2 = in.nextInt();
        for(int i=0;i<n2;i++)
            head2=push(head2,in.nextByte());
        head1=reverse(head1);
        head2=reverse(head2);
        Node sorted = mergelist(head1,head2);
        print(sorted);
        
    }

    
}
