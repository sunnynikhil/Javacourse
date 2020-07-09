/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.minimumsumlist.print;
import static javacourse.minimumsumlist.push;
import static javacourse.pairwiseswap.swap;

/**
 *
 * @author oyo
 */
public class deletemid {
    public static list deletemiddle(list root){
        list slow = root;
        list fast = root;
        list prev=null;
        if(root==null)
            return null;
        while(fast.next!=null && fast.next.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return root;
    }
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        list root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        root=deletemiddle(root);
        print(root);
           
    }
}
