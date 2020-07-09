/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import static javacourse.DLL.insert;
import static javacourse.DLL.print;

/**
 *
 * @author oyo
 */
import java.util.*;
class dll{
   int data;
   dll next,prev;
   dll(int d){
       this.data=d;
       next=prev=null;
   }
}
public class DLLmergesort {
    
    public static dll push(dll head,int data){
        if(head==null)
        {
            dll new_node = new dll(data);
            new_node.prev=null;
            new_node.next=null;
            head=new_node;
            return head;
        }    
        dll new_node = new dll(data);
        new_node.next=head;
        new_node.prev=null;
        if(head!=null)
            head.prev=new_node;
        head=new_node;
        return head;
    }
    public static dll split(dll node){
        dll slow=node,fast=node;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        dll temp = slow.next;
        slow.next=null;
        return temp;   
    }
    public static dll megreSort(dll node){
        if(node==null || node.next==null)
            return node;
        dll mid = split(node);
        
        node = megreSort(node);
        mid = megreSort(mid);
        return megreSortUtil(node,mid);
        
    }
    public static dll megreSortUtil(dll start,dll mid){
        if(start==null)
            return mid;
        if(mid==null)
            return start;
        if(start.data<mid.data){
            start.next = megreSortUtil(start.next,mid);
            start.next.prev= start;
            start.prev = null;
            return start; 
        }
        else
        {
            mid.next=megreSortUtil(mid.next,start);
            mid.next.prev=mid;
            mid.prev=null;
            return mid;
        }
    }
    public static void printdll(dll head){
        dll temp = head;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            temp = head;
            head=head.next;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            
            temp=temp.next;
        }
        
    }
   public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      dll head = null;
      for(int i=0;i<n;i++)
         head = push(head,in.nextInt());
      head=megreSort(head);
      printdll(head);
      
      
      
  } 
}
