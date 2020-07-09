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
import static javacourse.deleteBST.insert;
public class zigzigtree {
    
    public static void zigzig(Tree root){
        
        if(root==null)
            return;
        Stack<Tree> cur = new Stack<>();
        Stack<Tree> next = new Stack<>();
        cur.push(root);
        boolean lefttoright= true;
        
        while(cur.isEmpty()==false){
            Tree node = cur.pop();
            System.out.print(node.data+" ");
            
            if(lefttoright){
                if(node.left!=null)
                    next.push(node.left);
                if(node.right!=null)
                    next.push(node.right);
            }
            else{
                if(node.right!=null)
                    next.push(node.right);
                if(node.left!=null)
                    next.push(node.left);
            }
            
            if(cur.isEmpty()){
                lefttoright =!lefttoright;
                Stack<Tree> temp = cur;
                cur=next;
                next=temp;
                
            }
        }
        
        
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        zigzig(root);
    }
    
}
