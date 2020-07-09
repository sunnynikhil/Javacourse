/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.print;
import static javacourse.minimumsumlist.push;
import static javacourse.occuranceofanumber.countfrequent;

/**
 *
 * @author oyo
 */
public class pairwiseswap {
    public static list swap(list head){
        if(head==null && head.next==null)
            return head;
        list cur=head;
//        head=cur.next;
        while(cur!=null &&cur.next!=null)
        {
            int temp = cur.data;
            cur.data=cur.next.data;
            cur.next.data=temp;
            cur=cur.next.next;
        }
        
        return head;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        root=swap(root);
        print(root);
           
    }
}
