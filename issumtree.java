/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.diameteroftree.diameter;

/**
 *
 * @author oyo
 */
public class issumtree {
    public static int sum(Tree root){
        if(root==null)
            return 0;
        return (sum(root.left))+root.data+(sum(root.right));
    }
    public static boolean isSumTree(Tree root){
        if ( root == null ||(root.left==null&& root.right==null))
            return true;
        
        int ls=sum(root.left);
        int rs=sum(root.right);
        
        if(root.data == ls+rs&&isSumTree(root.left)!=false &&isSumTree(root.right)!=false)
            return true;
        return false;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        System.out.print(isSumTree(root));
    }
}
