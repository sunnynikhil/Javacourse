/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.binarytreefromparentarray.printTree;
import static javacourse.deleteBST.insert;
import static javacourse.widthoftree.getWidth;

/**
 *
 * @author oyo
 */
public class modifyBSTTree {
    static int sum;
    public static boolean isLeaf(Tree root)
    {
        if(root.left==null && root.right==null)
            return true;
        return false;
        
    }
    public static int getSum(Tree root)
    {
        int sum=0;
        if(root==null)
            return 0;
        if(isLeaf(root))
            return root.data;
        sum+=root.data+getSum(root.left)+getSum(root.right);
        return sum;
    }
    public static void getSumUtil(Tree root)
    {
        if(root==null)
            return;
        getSumUtil(root.left);
        int temp = root.data;
        root.data=sum;
        sum=sum-temp;
        getSumUtil(root.right);
    }
    public static void modify(Tree root)
    {
        sum = getSum(root);
        getSumUtil(root);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        modify(root);
        printTree(root);
    }
}
