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
class mnode{
    int data;
    mnode next;
    mnode(int d){
        this.data=d;
        next=next;
    }
}
public class megresortlinkedlist {
    
    public static mnode push(mnode head,int data){
        mnode newnode = new mnode(data);
        if(head== null)
            return newnode;
        else
        {
            newnode.next=head;
            return newnode;
        }
    }
    public static void print(mnode head){
        if(head==null)
            return;
        mnode cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        
    }
    public static mnode reverse(mnode head){
        if(head== null)
            return null;
        mnode cur = head;
        mnode next = null;
        mnode prev = null;
        while(cur!=null){
            next = cur.next;
            cur.next=prev;
            prev=cur;
            cur = next;
        }
        return prev;
    }
    public static mnode mergeU(mnode h1,mnode h2){
        mnode c1,c2,n1,n2;
        c1=h1;
        c2=h2;
        n1=h1.next;
        n2=h2.next;
        while(n1!=null && c2!=null){
            if((c1.data>= c2.data)&&(n1.data)<=c2.data){
                n2=c2.next;
                c1.next=c2;
                c2.next=n1;
                c1=c2;
                c2=n2;
            }
            else{
                if(n1.next!=null){
                    n1=n1.next;
                    c1=c1.next;
                }
                else
                {
                    n1.next=c2;
                    return h1;
                }
            }
        }
        return h1;
    }
    public static mnode merge(mnode h1 , mnode h2){
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        if(h1.data<h2.data)
            return mergeU(h2,h1);
        else
            return mergeU(h1,h2);
            
        
       
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        mnode head1 = null;
        mnode head2 = null;
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        for(int i=0;i<n1;i++)
        {
            int data = in.nextInt();
            head1=push(head1, data);
            
        }
        for(int i=0;i<n2;i++)
        {
            int data = in.nextInt();
            head2=push(head2, data);
            
        }
        head1=reverse(head1);
        head2=reverse(head2);
        print(head1);
        System.out.println();
        print(head2);
        System.out.println();
        mnode head = merge(head1,head2);
        print(head);
    }
    
}
