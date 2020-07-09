/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.issumtree.isSumTree;

/**
 *
 * @author oyo
 */

public class levelodertransvesal {
    public static int height(Tree root){
        if(root==null)
            return 0;
        int lh=0,rh=0;
        lh=height(root.left)+1;
        rh=height(root.right)+1;
        return Math.max(rh, lh)+1;
    }
    public static void levelorder(Tree root){
        int height = height(root);
        boolean flag  = true;
        for(int i=1;i<=height;i++)
        {
            printlevel(root,i,flag);
            flag=!flag;
            
        }
    }
    public static void printlevel(Tree root,int level,boolean flag){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data);
        if(flag==true)
        {
            printlevel(root.left,level-1,flag);
            printlevel(root.right,level-1,flag);
        }
        else
        {
            printlevel(root.right,level-1,flag);
            printlevel(root.left,level-1,flag);
            
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        levelorder(root);
    }
}
