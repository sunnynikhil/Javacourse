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
import static javacourse.deleteBST.insert;
import static javacourse.deleteBST.*;

public class inordersccussor {
    
    public static Tree findinorder(Tree root,int  key){
        
        while(root!=null)
        {
            if(root.data>key)
               root=root.left;
            else if(root.data<key)
               root=root.right;
            else
                return root;
        }
        return null;
    }
    
    public static Tree minval(Tree root){
        Tree current = root; 
  
        /* loop down to find the leftmost leaf */
        while (current.left != null) { 
            current = current.left; 
        } 
        return current; 
    }
    public static Tree findinordersuccor(Tree root, Tree in){
        System.out.print(in.data);
        if(in.right!=null)
            return minval(in.right);
      
            Tree cur = null;
            while(root!=null){
            if(in.data<root.data)
            {
                cur = root;
                root=root.left;
            }
            else if(in.data>root.data){
                root=root.right;
            }
            else 
                break;
            }
            return cur;
       
        
            
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root= null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        int key = in.nextInt();
        Tree ino = findinorder(root,key);
        Tree suc = findinordersuccor(root,ino);
        System.out.print(suc.data);
    }
}
