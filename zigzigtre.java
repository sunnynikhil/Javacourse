/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.verticalsum.verticalsum;

/**
 *
 * @author oyo
 */
import java.util.Stack;
public class zigzigtre {
    public static void zigzig(Tree root){
        Stack<Tree> cur = new Stack<>();
        Stack<Tree> next = new Stack<>();
        cur.push(root);
        boolean lefttoright=false;
        while(!cur.isEmpty()){
            Tree temp = cur.pop();
            System.out.print(temp.data+" ");
            if(lefttoright)
            {
                if(temp.right!=null)
                next.push(temp.right);
                if(temp.left!=null)
                next.push(temp.left);
            }
            else
            {if(temp.left!=null)
               next.push(temp.left);
               if(temp.right!=null)
                next.push(temp.right); 
            }
            if(cur.isEmpty()){
                Stack<Tree> t = cur;
                cur=next;
                next=t;
                lefttoright = !lefttoright;
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root  = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());

        zigzig(root);
        
    }
}
