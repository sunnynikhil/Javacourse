/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;
import java.util.LinkedList;
/**
 *
 * @author oyo
 */
public class SLL {
    Node head;  // head of list 
  
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
    
    public void append(int data)
    {
        Node new_node =new Node(data);
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        new_node.next=null;
        Node last = head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
        return;
        
    }
    
    public void push(int data){
      
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    
    }
    
    public void display(){
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
        
    }
    
    public void insertAt(int location ,int data){
        Node new_node =new Node(data);
        Node perv=head;
        Node curr=head;
        int count=1;
        if(location ==1 || location == 0)
        {
            new_node.next=head;
            head=new_node;
            return;
        }
        while(curr.next!=null && count<location)
        {
            perv=curr;
            curr=curr.next;
        }
        if(curr.next==null)
        {
            curr.next=new_node;
            new_node.next=null;
            return;
        }
        perv.next=new_node;
        new_node.next=curr;
        return;
        
        
    }
    public void delete(int key){
         Node temp=head;
         Node prev=null;
         if(temp!=null && temp.data==key)
         {
             head=temp.next;
             return;
         }
         while(temp!=null && temp.data!=key){
             prev=temp;
             temp=temp.next;
         }
         if(temp==null)return;
         prev.next=temp.next;
         return;
    }
    public void deleteAt(int postion)
    {
        Node temp=head;
        if(temp==null)return;
        if(postion ==0 )
        {
            head=temp.next;
        }
        for(int i=1;temp!=null&&i<postion-1;i++)
        {
            temp=temp.next;
        }
        if(temp==null || temp.next == null)
        {
           return; 
        }
        temp.next=temp.next.next;
    }
    public int length(){
        Node temp = head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        return length;
    }
    
    public int lengthR(Node node)
    {
        if(node== null)
            return 0;
        return 1+lengthR(node.next);
    }
    
    public int getcount()
    {
        return lengthR(head);
    }
    public boolean search(Node head,int data){
        if(head==null)
            return false;
        if(head.data == data)
            return true;
        search(head.next,data);
        
        return false;
    }
    
    public int getNth(int index){
        Node temp = head;
        if(temp==null)
            return -1;
        if(index==0)
            return temp.data;
        for(int i=0;temp!=null && i<index;i++)
            temp=temp.next;
        if(temp==null)
            return -1;
        return temp.data;
        
    }
    public int getNt(int data)
    {
        int len=0;
        Node curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
        if(len<data)
            return -1;
        Node temp= head;
        for(int i=0;temp!=null && i<len-data;i++)
            temp=temp.next;
        return temp.data;
    }
    
    public int getNthR(int n)
    {
    Node ptr1=head;
    Node prt2=head;
    int count=0;
    while(count<=n){
        if(ptr1==null)
            return -1;
       ptr1=ptr1.next;
       count++;
    }
    while(ptr1!=null)
    {
        prt2=prt2.next;
        ptr1=ptr1.next;
    }
    return prt2.data;
    }
    
    public int middle(){
        Node p1=head;
        Node p2=head;
        while(p2!=null && p2.next!=null)
        {
            
            p1=p1.next;
            p2=p2.next.next;
        }
        return p1.data;
    }
    public void removeduplicatesunsorted(){
     
        HashSet<Integer> hs = new HashSet<>(); 
      
        /* Pick elements one by one */
        Node current = head; 
        Node prev = null; 
        while (current != null)  
        { 
            int curval = current.data; 
              
             // If current value is seen before 
            if (hs.contains(curval)) { 
                prev.next = current.next; 
            } else { 
                hs.add(curval); 
                prev = current; 
            } 
            current = current.next; 
        } 
//        Node p1=head;
//        Node p2=head.next;
//        while(p1!=null)
//        {
//            while(p2!=null)
//            {
//                if(p1.data==p2.data)
//                    delete(p2.data);
//                p2=p2.next;
//            }
//            p1=p1.next;
//            if(p1!=null)
//              p2=p1.next;
//            
//        }
    }
    public void removeduplicates(){
        Node cur=head;
        while(cur!=null)
        {
            Node temp=cur;
            while(temp!=null && temp.data==cur.data)
                temp=temp.next;
            cur.next=temp;
            cur=cur.next;
        }
    }
    public void swapnodes(int key1,int key2){
        if(key1==key2)return;
        Node p1=head;
        Node p2=head;
        Node prev1=null;
        Node prev2=null;
        while(p1!=null && p1.data!=key1)
        {
            prev1=p1;
            p1=p1.next;
        }
        
        while(p2!=null && p2.data!=key2)
        {
            prev2=p2;
            p2=p2.next;
        }
        if(p1==null || p2==null)
            return;
        if(prev1!=null)
          prev1.next=p2;
        else
            head=p2;
        if(prev2!=null)
          prev2.next=p1;
        else
            head=p1;
        Node temp=p1.next;
        p1.next=p2.next;
        p2.next=temp;
        
        
    }
    public Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        
        Node rest = reverse(head.next);
        head.next.next=head;
        
        head.next=null;
        
        return rest; 
        
    }
    public void moveLast(){
        Node cur= head;
        Node first = null;
        if(head==null || head.next==null)return;
        while(cur.next!=null)
        {   first=cur;
            cur=cur.next;
        }
        first.next=null;
        cur.next=head;
        head=cur;
        
    }
    public static SLL intersection(Node head1 ,Node head2){
       
        SLL result =  new SLL();
        while(head1!=null && head2!=null)
        {
            if(head1.data<head2.data)
            {
                
                head1=head1.next;
            }
            else if(head1.data>head2.data)
            {
                
                head2=head2.next;
            }
            else if (head1.data==head2.data)
            {
                result.append(head2.data);
                head1=head1.next;
                head2=head2.next;
            }
        }
            
        return result;
    }
    public void seggegerat(){
        Node cur = head;
        Node last = head;
        while(last.next!=null)
         last=last.next;
        while(cur!=last)
        {
            int count =0;
//        count  System.out.println("cur="+cur.data);
            if(cur.data%2!=0)
            {
                Node perv = cur;
                Node temp= cur.next;
                last.next=cur;
                
                cur.next=null;
                cur=temp;
                count = 1;
                
            }
            else
             cur=cur.next;
         if(count==1)
             head=cur;
        }
    }
    public void resverseK(int k){
       
        if (k == 0) return; 

        Node current  = head; 
        int count = 1; 
        while (count < k && current !=  null) 
        { 
            current = current.next; 
            count++; 
        }  
        if (current == null) 
            return;  
        Node kthNode = current; 
   
        while (current.next != null) 
            current = current.next; 
  
        current.next = head; 
  
        // Change head to (k+1)th node 
        // head is now changed to node 50 
        head = kthNode.next; 
  
        // change next of kth node to null 
        kthNode.next = null; 
        
      
    }
    public static void main(String args[]){
     
        SLL list = new SLL();
        SLL list1 = new SLL();
        SLL result = new SLL();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.display();
        list.resverseK(3);
        System.out.println("---***---");
        list.display();

    } 
    
}
