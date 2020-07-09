/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.TreeisBaalancedorNot.BalanceOrNot;
import static javacourse.deleteBST.insert;
import static javacourse.mirrortree.mirror;

/**
 *
 * @author oyo
 */
public class systemricTree {
    public static boolean isMirror(Tree a,Tree b)
    {
        if(a.data!=b.data)
            return false;
        boolean ans;
        ans=isMirror(a.left,b.right);
        ans=isMirror(a.right,b.left);
        return ans;
        
    }
    public static boolean isSymmetric(Tree root)
    {
        if(root==null)
            return false;
        return isMirror(root.left,root.right);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        System.out.println(isSymmetric(root));
        
    }
}
