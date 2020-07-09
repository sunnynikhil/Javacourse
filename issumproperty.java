/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.zigzigtre.zigzig;

/**
 *
 * @author oyo
 */
public class issumproperty {
    public static boolean issumproperty(Tree root){
        int ls=0,rs=0;
        if(root==null||(root.left==null && root.right==null))
            return true;
        if(root.left!=null)
        ls=root.left.data;
        if(root.right!=null)
        rs = root.right.data;
        if(root.data==ls+rs && issumproperty(root.left) && issumproperty(root.right))
            return true;
        else
            return false;
        
        
            
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root  = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());

        System.out.print(issumproperty(root));
        
    }
}
