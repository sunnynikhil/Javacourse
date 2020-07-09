/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
import java.util.Stack;

class rnode{
    int data;
    rnode next;
    rnode(int d){
        this.data = d;
        next = null;
    }
}
public class ReverseK {
    
    
    public static rnode reverse(rnode head,int k){
        rnode prev = null;
        Stack<rnode> stack = new Stack<rnode>();
        rnode cur = head;

        while(cur!=null){
            int count=0;
            while(cur!=null && count<k){
                stack.push(cur);
                count++;
                cur=cur.next;
            }
            while(stack.size()>0){
            if(prev==null){
               prev=stack.peek();
               head=prev;
               stack.pop();
            }
            else{
                prev.next=stack.peek();
                prev=prev.next;
                stack.pop();
            }
            }
        }
        prev.next = null;
        return head;
    }
    public static rnode push(rnode head,int data){
        rnode new_node = new rnode(data);
        new_node.next=head;
        return new_node;
    }
    
    public static void print(rnode head){
        if(head==null)
            return ;
        rnode cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    rnode head = null;
    for(int i=0;i<n;i++){
        int data = in.nextInt();
        head = push(head,data);
    }
    print(head);
    int k = in.nextInt();
    head=reverse(head,k);
    print(head);
    
            }
}
