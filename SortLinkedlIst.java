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
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
class tnode{
    int data;
    tnode next;
    tnode(int d){
        this.data=d;
        next=null;
    }
}
public class SortLinkedlIst {

    public static tnode insert(tnode head , int data){
        tnode new_node = new tnode(data);
        if(head==null)
            return new_node;
        else{
            tnode cur=head;
            while(cur.next!=null)
                cur=cur.next;
            cur.next=new_node;
            
            return head;
        }
    }
    public static void print(tnode head)
    {
        if(head == null)
            return;
        tnode cur= head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        
    }
    
    public static  tnode sortedmerge(tnode a ,tnode b){
        tnode result = null;
       
       
        if(a==null)
            return b;
        if(b==null)
            return a;
        if(a.data <= b.data){
            result = a;
            result.next = sortedmerge(a.next,b);
        }
        else
        {
            result = b;
            result.next = sortedmerge(a,b.next);
        
        }
        
        return result;
    }
    public static tnode mergesort(tnode head){
        
//        int i=0;
        if(head==null|| head.next == null)
            return head;
        tnode middle = getmiddle(head);
        tnode nextofmiddle = middle.next;
        
        middle.next = null;
        
        tnode left = mergesort(head);
        tnode right = mergesort(nextofmiddle);
        
        tnode sortlist = sortedmerge(left,right);
        return sortlist;
         
    }
    public static tnode getmiddle(tnode root){
        tnode slow = root;
        tnode fast = root;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      tnode head = null;
      for(int i=0;i<n;i++){
          int data= in.nextInt();
          head=insert(head,data);
      }
      head=mergesort(head);
      print(head);
       
  }
  
    }
