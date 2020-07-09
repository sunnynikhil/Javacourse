/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.push;
import static javacourse.reversekgroup.printlist;

/**
 *
 * @author oyo
 */
public class Addone {
    public static list reverse(list head)
    {
        list prev=null,cur=head,next=null;
        while(cur!=null)
        {
                next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
                
            
              
        }
        return prev;
    }
    public static list addone(list head){
        head=reverse(head);
//        printlist(head);
        list cur= head;
        int carry=0;
        do
        {
            System.out.println("cur:"+cur.data);
            int sum=cur.data+1;
            cur.data=sum%10;
            carry=sum/10;
            cur=cur.next;
        }while(carry>0 && cur!=null);
        if(carry>0)
            head=push(head,carry);
        return reverse(head);
    }
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     list head =null;
     for(int i=0;i<n;i++)
         head=push(head,in.nextInt());
     head = addone(head);
     printlist(head);
     
    }
}
