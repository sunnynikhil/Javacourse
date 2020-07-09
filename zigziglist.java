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
public class zigziglist {
    public static void zigzig(list head)
    {
        list cur = head;
        boolean f= true;
        while(cur.next!=null)
        {
            if(f==true)
            {
                if(cur.data>cur.next.data)
                {
                    int temp = cur.data;
                    cur.data=cur.next.data;
                    cur.next.data=temp;
                }
            }
            else
            {
                if(cur.data<cur.next.data)
                {
                    int temp = cur.data;
                    cur.data=cur.next.data;
                    cur.next.data=temp;
                }
            }
            
            cur=cur.next;
            f=!f;
        }
    }
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    list head = null;
    for(int i=0;i<n;i++)
        head=push(head,in.nextInt());
    zigzig(head);
    printlist(head);
    
}
    
}
