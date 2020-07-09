/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;

/**
 *
 * @author oyo
 */

public class LinkedLis {
    
    Node head;
    
    static class Node{
         int data;
         Node next;
         
         Node(int d)
         {
         data=d;
         next =null;
         }
     }
    
    public static void insert_at_end(Node list,int data)
    {
        Node new_node=new Node(data);
        new_node.next=null;
        Node curr=list;
        if(list==null)
        {
          list=new_node; 
        }
        else{
        while(curr!=null)
        {
            curr=curr.next;
        }
        curr=new_node;
        }
    }
    
    public static void insert_at_begin(Node list,int data){
        
       
    }
    
    public static void delete(Node list,int data){
        
    }
    public static void display(Node list){
        Node curr = list;
      while(curr.next!=null)
      {
          System.out.print(curr.data);
          curr=curr.next;
      }
        
    }
    public static void main(String args[]){
        LinkedLis list = new LinkedLis();
        list.head=null;
        int chioce=0;
        Scanner s=new Scanner(System.in);
        do{
            chioce =s.nextInt();
        switch(chioce){
            case 1:
                int insert;
                System.out.println("enter a number to insert");
                Scanner sc=new Scanner(System.in);
                insert=sc.nextInt();
                insert_at_end(list.head,insert);
                break;
            case 2:
                int insert1;
                System.out.println("enter a number to insert at end");
                Scanner sc1=new Scanner(System.in);
                insert1=sc1.nextInt();
                insert_at_begin(list.head,insert1);
                break;
            case 3:
                int delete;
                System.out.println("enter a number to delete");
                Scanner sc3=new Scanner(System.in);
                delete=sc3.nextInt();
                delete(list.head,delete);
                break;
            case 4:
                display(list.head);
                break;
            case 5:
               System.exit(0);
                
    }
        System.out.println("1->insert at end");
        System.out.println("2->insert at begining");
        System.out.println("3->insert at delete");
        System.out.println("4->insert at display");
        System.out.println("5->insert at exit");
 
                }while(chioce<5);
   
    } 
    
}
