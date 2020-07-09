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
public class levelordertranversal {
    public static int heightoftree(Tree root){
        if(root==null)
            return 0;
        int l=0,r=0;
         l+=heightoftree(root.left);
         r+=heightoftree(root.right);
         return 1+Integer.max(l, r);
    }
    public static void levelorder(Tree root){
        int height=heightoftree(root);
        for(int i=1;i<=height;i++)
            printlevel(root,i);
    }
    public static void printlevel(Tree root,int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        printlevel(root.left,level-1);
        printlevel(root.right,level-1);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n =in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        levelorder(root);
    }
    
}
