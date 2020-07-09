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
import java.util.HashMap;
import java.util.Vector;
import java.util.*;
import java.util.Map.Entry;
public class diaglonal {
    
    public static void diagnaluil(rootNode root , int d ,HashMap<Integer,Vector<Integer>> queue){
        if(root==null)
            return;
        Vector<Integer> k = queue.get(d);
        if(k==null)
        {
            k=new Vector();
            k.add(root.data);
            
        }
        
        else
        {
            k.add(root.data);
        }
        queue.put(d, k);
        diagnaluil(root.left,d+1,queue);
        diagnaluil(root.right,d,queue);
        
    }
    
    public static void diagnal(rootNode root){
        
        HashMap<Integer,Vector<Integer>> queue = new HashMap<>();
        diagnaluil(root,0,queue);
        
        for(Entry<Integer,Vector<Integer>> entry : queue.entrySet()){
            System.out.print(entry.getValue());
        }
        
    }
    public static void main(String[] args){
        
        rootNode root = new rootNode(8);
         root.left = new rootNode(3); 
        root.right = new rootNode(10); 
        root.left.left = new rootNode(1); 
        root.left.right = new rootNode(6); 
        root.right.right = new rootNode(14); 
        root.right.right.left = new rootNode(13); 
        root.left.right.left = new rootNode(4); 
        root.left.right.right = new rootNode(7);
        diagnal(root);
    }
}
