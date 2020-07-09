/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import java.util.Stack;
import static javacourse.mergesortlinkedlist.print;
import static javacourse.minimumsumlist.push;

/**
 *
 * @author oyo
 */
public class reversekgroup {
    public static list reversek(list head,int k){
        Stack<list> stack = new Stack<>();
        list prev=null;
        list cur = head;
        list track = head;
        
        while(cur!=null)
        {   int count =k;
            while(cur!=null &&count>0)
            {
                stack.push(cur);
                cur=cur.next;
                count--;
            }
            if(stack.size()==k){
            while(!stack.empty()){
            if(prev==null)
            {
               prev=stack.pop();
               head =prev;
               
               
            }
            else
            {
                prev.next=stack.pop();
                prev=prev.next;
                
            }
            
            }
            track=cur;
        }
        }
        while(!stack.empty() && track!=null)
        {
            prev.next=track;
            prev=prev.next;
            track=track.next;
            stack.pop();
        }
        prev.next=null;
        return head;
    }
    public static void printlist(list node)
    {
        list cur=node;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        list node = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            node = push(node,in.nextInt());
        int k = in.nextInt();
        node = reversek(node,k);
        printlist(node);
        
        
    }
}
