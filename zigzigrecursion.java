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
public class zigzigrecursion {
    public static int heightoftree(Tree root){
        if(root==null)
            return 0;
        int lh = heightoftree(root.left);
        int rh = heightoftree(root.right);
        
        return Math.max(rh, lh)+1;
    }
    public static void printleft(Tree root , int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else
        {
            printleft(root.right,level-1);
            printleft(root.left,level-1);
        }
    }
    public static void printright(Tree root , int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else
        {
            printleft(root.left,level-1);
            printleft(root.right,level-1);
        }
    }
    public static void printzigzig(Tree root){
        if(root==null)
            return;
        int flag=0;
        int height=heightoftree(root);
        for(int i=1;i<=height;i++)
        {
            if(flag==1)
            {
                printleft(root,i);
             flag=0;   
            }
            else
            {
                printright(root,i);
                flag=1;
            }
        }
    }
    
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        printzigzig(root);
    }
}
