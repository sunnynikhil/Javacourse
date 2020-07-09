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
public class flattenlist {
    Node head;
    class Node{
        int data;
        Node right,down;
        Node(int d){
            this.data=d;
            right=null;
            down=null;
            
        }
    }
    public  Node push(Node head , int data){
        Node new_node = new Node(data);
        new_node.down= head;
        head=new_node;
        
        
        
        return head;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.down;
        }
        System.out.println();
    }
    public Node merge(Node a , Node b){
        if(a==null)
            return b;
        if(b==null)
            return a;
        Node result;
        if(a.data<b.data){
            result=a;
            result.down=merge(a.down,b);
        }
        else
        {
            result = b;
            result.down = merge(a,b.down);
        }
        result.right = null;
        return result;
    }
    public Node flatten(Node root){
    if(root==null||root.right==null)
        return root;
    
    root.right=flatten(root.right);
    root= merge(root,root.right);
    
    return root;
    
        
    }
    public static void main(String[] args){
        
        flattenlist L = new flattenlist();
        L.head = L.push(L.head, 30); 
        L.head = L.push(L.head, 8); 
        L.head = L.push(L.head, 7); 
        L.head = L.push(L.head, 5); 
  
        L.head.right = L.push(L.head.right, 20); 
        L.head.right = L.push(L.head.right, 10); 
  
        L.head.right.right = L.push(L.head.right.right, 50); 
        L.head.right.right = L.push(L.head.right.right, 22); 
        L.head.right.right = L.push(L.head.right.right, 19); 
  
        L.head.right.right.right = L.push(L.head.right.right.right, 45); 
        L.head.right.right.right = L.push(L.head.right.right.right, 40); 
        L.head.right.right.right = L.push(L.head.right.right.right, 35); 
        L.head.right.right.right = L.push(L.head.right.right.right, 20); 
  
       
        L.head = L.flatten(L.head); 
  
        L.print();
        
    }
}
