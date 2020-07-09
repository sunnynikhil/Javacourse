/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.TreeisBaalancedorNot.BalanceOrNot;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class subtreesSum {
    static int count=0;
    public static boolean isLeaf(Tree root)
    {
        return (root.left==null && root.right==null);
    }
    public static int countSubtrees(Tree root,int sum)
    {
        if(root==null)
            return 0;
        if(isLeaf(root))
            return root.data;
        int x = root.data+countSubtrees(root.left,sum)+countSubtrees(root.right,sum);
        if(sum==x)
            count++;
        return x;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        int sum= in.nextInt();
        countSubtrees(root,sum);
        System.out.println(count);
        
    }
}
