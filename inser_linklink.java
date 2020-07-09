/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.lang.*;
/**
 *
 * @author oyo
 */
public class inser_linklink {
     Node head;
     
//     static class ode{
//         int data;
//         Node next;
//         
//         Node(int d)
//         {
//         data=d;
//         next =null;
//         }
//     }
     public static inser_linklink insert(inser_linklink list,int data)
     {
         Node new_node= new Node(data);
         new_node.next=list.head;
         
         list.head=new_node;
         return list;
     }
     
   public static void printlist(inser_linklink list)
   {
       Node curr_node = list.head;
       while(curr_node!=null)
       {
           System.out.println(curr_node.data);
           curr_node=curr_node.next;
       }
       
   }
   public static void middleelement(inser_linklink list)
   {
        Node cur=list.head;
        Node cur1=list.head;
       while(cur1!=null&&cur.next!=null)
       {
           if(cur.next.next!=null)
           {
               cur=cur.next;
               cur=cur.next.next;
           }
       }
       
       System.out.print(cur.data);
   }
   public static void main(String[] args)
   {
       inser_linklink list =new inser_linklink();
       list=insert(list,1);
       list=insert(list,2);
       list=insert(list,3);
       list=insert(list,4);
       list=insert(list,5);
       middleelement(list);
       
   }
    
}
else if(choice == 2) {
                if(two.isEmpty()) {
                    while(!one.isEmpty()) {
                        two.push(one.pop());
                    }
                   
                }  
                two.pop();
            }
            
            else if(choice == 3) {
               if(two.isEmpty()) {
                    while(!one.isEmpty()) {
                        two.push(one.pop());
                    }
               }
               System.out.println(two.peek()); 
            }