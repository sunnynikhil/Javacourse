/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.normaltreetobst.buildBST;
import static javacourse.normaltreetobst.print;

/**
 *
 * @author oyo
 */

public class isBST {
    public static boolean isBSTUtil(Tree root,int min,int max){
        
        if(root==null)
            return true;
        if(root.data<min || root.data>max)
            return false;
        return (isBSTUtil(root.left,min,root.data-1) && isBSTUtil(root.right,root.data+1,max));
        
        
    }
    public static boolean isBST(Tree root){
        return isBSTUtil(root,-999999,999999);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        System.out.print(isBST(root));
        
    }
}
