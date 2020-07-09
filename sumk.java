/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */

import java.util.*;
import static javacourse.deleteBST.insert;
import static javacourse.deleteBST.print;
public class sumk {
    
    public static Tree pureTree(Tree root,int sum){
        if(root==null)
            return null;
        root.left=pureTree(root.left,sum-root.data);
        root.right=pureTree(root.right,sum-root.data);
        if(isleaf(root)){
            if(sum>root.data)
                root=null;
        }
        return root;
    }
    public static boolean isleaf(Tree root){
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
            return true;
        return false;
    }
    public static void main(String[] args){
        Tree root = null;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            root=insert(root,in.nextInt());
        }
        int sum = in.nextInt();
        print(root);
        System.out.println();
        root=pureTree(root,sum);
        print(root);
    } 
}
