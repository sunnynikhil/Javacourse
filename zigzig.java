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
public class zigzig {
    public static void zigzig(Tree root){
//        Tree cur = root;
        Stack<Tree> cur = new Stack<>();
        Stack<Tree> next = new Stack<>();
        boolean flag = true;
        cur.push(root);
//        HashSet<Integer> ans = new HashSet<>();
        
        while(cur.isEmpty()==false){
        Tree node = cur.pop();
        System.out.print(node.data+" ");
        if(flag){
            if(node.left!=null)
                next.push(node.left);
            if(node.right!=null)
                next.push(node.right);
        }
        else
        {
           if(node.right!=null)
                next.push(node.right); 
           if(node.left!=null)
                next.push(node.left);
        }
        if(cur.isEmpty()==true){
            Stack<Tree> temp = next;
            next=cur;
            cur = temp;
            flag=!flag;
        }
    }
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root=null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        zigzig(root);
    }
}
