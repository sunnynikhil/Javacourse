/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.sumofroot.insert;
import static javacourse.sumofroot.printsum;

/**
 *
 * @author oyo
 */
class rbst{
    int data;
    rbst left;
    rbst right;
    rbst(int d){
        this.data =d;
        left=right=null;
    }
}
public class RecoverBST {
    
    rbst first=null,second=null,last=null,prev =null;
     
    public static rbst insert(rbst root,int data){
        if(root == null)
            return new rbst(data);
        else 
        {
            rbst cur= root;
            if(data>root.data)
            {
                cur=insert(root.right,data);
                root.right=cur;
            }
            else
            {
                cur=insert(root.left,data);
                root.left = cur;
            }
            return root;
        }
        
    }

    
    public static void print(rbst root){
        if (root == null)
            return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
    
    void constructTree(rbst node){
        
        if(node!=null){
            constructTree(node.left);
            
            if(prev!=null && node.data<prev.data){
                
                if(first == null)
                {
                    first=prev;
                    second = node;
                }
                else
                    last = node;
            }
            
            prev=node;
            
            constructTree(node.right);
            
            
        }
    }
    
    void recovertree(rbst node){
        constructTree(node);
        if(first!=null && last!=null){
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        }
        else if(first!=null && second!=null ){
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
            
        }
        
    }
   public void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        rbst tree = null;
        for(int i=0;i<n;i++)
            tree=insert(tree,in.nextInt());
        recovertree(tree);
        print(tree);
    }
}
