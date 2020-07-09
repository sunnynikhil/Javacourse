/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.binarytreefromparentarray.printTree;
import static javacourse.deleteBST.insert;
import static javacourse.sumtree.ToSumTree;

/**
 *
 * @author oyo
 */
public class TreeisBaalancedorNot {
    public static int getHiegth(Tree root)
    {
        if(root==null)
            return 0;
        int lh=0,rh=0;
        lh=getHiegth(root.left)+1;
        rh=getHiegth(root.right)+1;
        return Math.max(rh, lh);
        
    }
    public static boolean BalanceOrNot(Tree root)
    {
        if(root==null)
            return true;
        int leftHeigth = getHiegth(root.left);
        int rightHeigth = getHiegth(root.right);
        return ((Math.abs(leftHeigth-rightHeigth)<=1) && BalanceOrNot(root.left) && BalanceOrNot(root.right));
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        System.out.println(BalanceOrNot(root));
        
    }
}
