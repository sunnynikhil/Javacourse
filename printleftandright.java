/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import static javacourse.deleteBST.insert;
import java.util.LinkedList;
/**
 *
 * @author oyo
 */
public class printleftandright {

    public static void printLeftAndRight(Tree root)
    {
       Queue<Tree> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty())
       {
           int n = q.size();
           for(int i=0;i<n;i++)
           {
               Tree node = q.peek();
               q.poll();
               if(i==0 || i==n-1)
                   System.out.print(node.data+" ");
               if(node.left!=null)
                   q.add(node.left);
               if(node.right!=null)
                   q.add(node.right);
           }
       }
        
        
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        printLeftAndRight(root);
        
    }
}
