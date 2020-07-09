/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.minleafsum.minLeafSum;
import java.util.Stack;

/**
 *
 * @author oyo
 */
public class reverselevelordertrans {
    public static int getHeight(Tree root)
    {
        if(root==null)
            return 0;
        int l=0,r=0;
        l=getHeight(root.left)+1;
        r=getHeight(root.right)+1;
        return Math.max(l, r);
    }
    public static void reversePrint(Tree root)
    {
     int height = getHeight(root);  
     Stack<Integer> stack = new Stack<>();
     for(int i=1;i<=height;i++)
         levelordertravsral(root,i,stack);
     while(!stack.empty())
     {
         System.out.print(stack.peek()+" ");
         stack.pop();
     }
     System.out.println();
    }
    public static void levelordertravsral(Tree root,int level,Stack<Integer> stack)
    {
        if(root==null)
            return;
        if(level==1)
        {
            stack.add(root.data);
            return;
        }
        levelordertravsral(root.right,level-1,stack);
        levelordertravsral(root.left,level-1,stack);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());        
        reversePrint(root);
        
    }
}
