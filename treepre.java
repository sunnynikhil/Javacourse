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
import static javacourse.deleteBST.print;
public class treepre {
    
    public static void converttopre(Tree root){
        if(root==null)
            return ;
       
        Tree pre = null;
        Stack<Tree> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Tree node = stack.peek();
            stack.pop();
//            System.out.println("root:"+node.data);
            if(node.right!=null)
                stack.push(node.right);
            if(node.left!=null)
                stack.push(node.left);
            if(pre!=null)
            {
                pre.right=node;
            }
            
            pre=node;
        }
        System.out.println();
        printpre(root);
    }
    static void printpre(Tree root)  
{  
    while (root != null) {  
        System.out.print(root.data + " ");  
        root = root.right;  
    }  
}  
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            root=insert(root,in.nextInt());
        }
//        print(root);
        converttopre(root);
        
    }
}
