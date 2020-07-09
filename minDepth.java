/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class minDepth {
    static int min ;
    static boolean isLeaf(Tree root)
    {
        if(root.left==null && root.right==null)
          return true;
        return false;  
    }
    static int minDepthUtil(Tree root,int level)
    {
        
        if(root==null)
           return level;
        level++;
       
            return Math.min(minDepthUtil(root.left,level),
              minDepthUtil(root.right,level));
           
        
    }
	static int minDepth(Tree root)
	{
	    min=0;
	    minDepthUtil(root,0);
	    return min;
	    
	}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        System.out.print(minDepth(root));
        
        
    }
}
