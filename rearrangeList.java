/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.push;
import static javacourse.removeDulipcatesinlist.removeDuplicates;
import static javacourse.reversekgroup.printlist;

/**
 *
 * @author oyo
 */
public class rearrangeList {
    public static list rearangeList(list head)
    {
        list cur=head;
        int odd[] = new int[10000];
        int even[]= new int[10000];
        int i=0,j=0;
        while(cur!=null)
        {
            odd[i++]=cur.data;
            cur=cur.next;
            if(cur!=null)
            {even[j++]=cur.data;
               cur=cur.next;
            }
        }
        for(int k=0;k<i;k++)
            System.out.print(odd[k]+" ");
        System.out.println();
        list res=null;
        for(int k=0;k<i;k++)
            res = push(res,odd[k]);
        for(int k=0;k<j;k++)
            res = push(res,even[k]);
        return res;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list head = null;
        for(int i=0;i<n;i++)
            head=push(head,in.nextInt());
        head=rearangeList(head);
        printlist(head);

    }
}
