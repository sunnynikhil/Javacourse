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
import javacourse.LinkedLis.Node;

public class plandlinkedlist {
    public static int lenght(node root){
        if(root==null)
            return 0;
        int length=0;
        while(root!=null){
            length++;
            root=root.next;
        }
        return length;
    }
    public static Node reverse(Node root){
        Node cur=root;
        Node next=null;
        Node pre = null;
        if(root==null)
            return null;
        while(cur!=null){
            next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
    public static boolean plandornot(Node root){
//        int length = lenght(root);
        boolean flag = true;
        Node rev = reverse(root);
        Node cur = root,r=rev;
        while(cur!=null){
            if(cur.data!=r.data)
            {
                
                return false;
            }
            cur=cur.next;
            r=r.next;
        }
        
        return flag;
    }
    public static Node push(Node root,int data){
        if(root==null)
            return  new Node(data);
        Node new_node = new Node(data);
        new_node.next=root;
        return new_node;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = null;
        for(int i=0;i<n;i++)
            root=push(root,in.nextInt());
        boolean check = plandornot(root);
        if(check==true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }

    
}
