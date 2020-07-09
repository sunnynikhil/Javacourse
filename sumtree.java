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
public class sumtree {
    public static int ToSumTree(Tree root)
    {
        if(root==null)
            return 0;
        int old_value=root.data;
        
        root.data = ToSumTree(root.left)+ToSumTree(root.right);
        return old_value+root.data;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        ToSumTree(root);
        printTree(root);
        
    }
}
