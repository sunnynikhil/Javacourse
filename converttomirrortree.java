/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.binarytreefromparentarray.printTree;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class converttomirrortree {
    public static void mirror(Tree root )
    {
        if(root==null)
            return ;
        mirror(root.left);
         mirror(root.right);
        
        Tree temp =root.left;
        root.left = root.right;
        root.right = temp;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
         mirror(root);
         printTree(root);
        
    }
}
