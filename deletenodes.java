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
public class deletenodes {
    public static list deleteAllOccurances(list head,int k)
    {
        if(head==null)
            return null;
        list prev=null;
        while(head.data==k)
        {
            
            
            head=head.next;
        }
        list cur=head;
        while(cur!=null)
        {
            if(cur.data==k)
            {
                prev.next=cur.next;
                cur=cur.next;
            }
            else
            {
                prev=cur;
                cur=cur.next;
            }
        }
        return head;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        list head = null;
        for(int i=0;i<n;i++)
            head = push(head,in.nextInt());
        head = deleteAllOccurances(head,k);
        printlist(head);
    }
}
