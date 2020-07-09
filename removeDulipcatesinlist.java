/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Scanner;
import static javacourse.minimumsumlist.push;
import static javacourse.reversekgroup.printlist;
import static javacourse.zigziglist.zigzig;

/**
 *
 * @author oyo
 */
public class removeDulipcatesinlist {
    public static void removeDuplicates(list head)
    {
        list cur=head,prev=null;
        HashSet<Integer> set = new HashSet<>();
        while(cur!=null)
        {
            if(set.contains(cur.data))
            {
                prev.next=cur.next;
                cur=cur.next;
            }
            else
            {  set.add(cur.data);
                prev=cur;
                cur=cur.next;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list head = null;
        for(int i=0;i<n;i++)
            head=push(head,in.nextInt());
        removeDuplicates(head);
        printlist(head);

    }
}
