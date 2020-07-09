/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.levelodertransvesal.levelorder;

/**
 *
 * @author oyo
 */
public class roottoleafsum {
    public static boolean isLeaf(Tree root){
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
            return true;
        return false;
    }
    public static boolean sum(Tree root,int sum){
        if(root==null)
            return false;
        if(isLeaf(root))
        {
            if(sum-root.data==0)
                return true;
        }
        if(sum(root.left,sum-root.data)||sum(root.right,sum-root.data))
            return true;
        return false;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int sum=in.nextInt();
        System.out.print(sum(root,sum));
    }
}
