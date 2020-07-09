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

public class evenoddlist {
    public static list modify(list head)
    {
        list even=null,odd=null,cur=head;
        while(cur!=null)
        {
            if(cur.data%2==0)
                even=push(even,cur.data);
            else
                odd=push(odd,cur.data);
            cur=cur.next;
        }
        
        cur=even;
        while(cur.next!=null)
            cur=cur.next;
        cur.next=odd;
        return even;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         list head = null;
         for(int i=0;i<n;i++)
             head=push(head,in.nextInt());
         head = modify(head);    
	 printlist(head);
	 }
	 }
}
