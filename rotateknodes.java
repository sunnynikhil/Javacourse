/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.print;
import static javacourse.removeNthNodefromend.push;
import static javacourse.removeNthNodefromend.removeNthNode;

/**
 *
 * @author oyo
 */
public class rotateknodes {
    public static list rotateKNodes(list head,int k)
    {
        if(head==null)
            return null;
        int len=0;
        list cur=head;
        while(cur!=null)
        {
            len++;
            cur=cur.next;
            
        }
        k=len-k;
        int count=1;
        cur=head;
        while(count<k&&cur!=null)
        {
            cur=cur.next;
            count++;
        }
        list knode = cur;
        while(cur.next!=null)
            cur=cur.next;
        cur.next=head;
        head=knode.next;
        knode.next=null;
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
            int k = in.nextInt();
            head=rotateKNodes(head,k);
            print(head);
        
        }
        
    }
}
