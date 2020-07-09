/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static javacourse.minimumsumlist.print;
import static javacourse.removeNthNodefromend.push;
import static javacourse.swapnodes.swap;

/**
 *
 * @author oyo
 */
public class removedulipcatesinlinkedlist {
    public static list removeduplicates(list head)
    {
        list cur=head,prev=null;
        Set<Integer> set = new HashSet<>();
        while(cur!=null)
        {
            if(!set.contains(cur.data))
                set.add(cur.data);
            else
                prev.next=cur.next;
            prev=cur;
            cur=cur.next;
        }
        return head;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            list head = null;
            for(int i=0;i<n;i++)
                head=push(head,in.nextInt());
            head=removeduplicates(head);
            System.out.println();
            print(head);
        
        }
        
    }
}
