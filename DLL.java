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
public class DLL {
    Node head;
            static class Node{
              int data;
              Node next;
              Node prev;
              Node(int d)
              { 
                  data=d;
              }
            }
  public static void insert(Node head,int data)
  {
      Node cur=new Node(data);
      Node tracker=head;
      if(head==null)
      {
          cur.prev=null;
          cur.next=null;
      }
      else
      {
          while(tracker!=null)
          {
              tracker=tracker.next;
          }
          cur.prev=tracker;
          cur.next=null;  
      }
      
      
  }
  public static void print(Node head)
  {
      Node curr=head;
      while(curr.next!=null)
      {
          System.out.print(curr.data);
          curr=curr.next;
      }
  }
  public static void main(String[] args)
  {
      DLL list=new DLL();
      insert(list.head,1);
      insert(list.head,3);
     insert(list.head,2);
      print(list.head);
      
      
  }
    
}
