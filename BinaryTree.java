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
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinaryTree {
 
    
    public static Node insert(Node root , int data){
        if(root==null)
        {
            return new Node(data);
            
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;     
            }
            else
            {
               cur=insert(root.right,data);
               root.right=cur;
            }
            return root;
        }
       
    }
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        Node cur = root;
        Stack<Node> s = new Stack<Node>();
        while(cur!=null || s.size()>0){
            while(cur!=null)
            {
                s.push(cur);
                cur=cur.left;
            }
            cur=s.pop();
            System.out.print(cur.data);
            cur=cur.right;
        }
        
    }
    
    public static void preorder(Node root)
    {
        
        if(root==null)
            return;
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data); 
    }
    
    public static void postorder(Node root)
    {
       
        if(root==null)
            return;
        System.out.print(root.data);
        postorder(root.left);
        postorder(root.right);
         
    }
    
    public static void main(String[] args)
    {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            int data=sc.nextInt();
            root=insert(root,data);
        }
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
