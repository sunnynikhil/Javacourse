/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.closestElement.getPosition;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class maxsumleaftoleaf {
    static int max_sum;
    public static boolean isLeaf(Tree root)
    {
        return (root.left==null && root.right==null);
    }
    public static int findPath(Tree root)
    {
        if(root==null)
            return 0;
        if(isLeaf(root))
            return root.data;
        int l = findPath(root.left);
        int r = findPath(root.right);
        if(root.left!=null && root.right!=null)
        {
           max_sum=Math.max(max_sum, l+r+root.data);
           return Math.max(r, l)+root.data;
        }
        else if(root.right!=null)
        {
            return r+root.data;
        }
        else
        {
            return l+root.data;
        }
    }
    public static int getMax(Tree root)
    {
        max_sum = Integer.MIN_VALUE;
        findPath(root);
        return max_sum;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        
        System.out.print(getMax(root));
    }
}
