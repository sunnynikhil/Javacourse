/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.deleteBST.insert;
import static javacourse.widthoftree.getWidth;

/**
 *
 * @author oyo
 */
public class closestElement {
    public static Tree getNode(Tree root,int key)
    {
        int min_diff=Integer.MAX_VALUE;
        Tree res = null;
        while(root!=null)
        {
            if(key>root.data)
            {
                if(key-root.data<min_diff)
                {
                    min_diff=key-root.data;
                    res=root;
                }
                root=root.right;
                
            }  
            else if (key<root.data)
            {
                if(root.data-key<min_diff)
                {
                    min_diff=root.data-key;
                    res=root;
                }
                root=root.right;
                
            }
            else
            {
                return root;
            }
        }
        return res;
    }
    
    public static int getPosition(Tree root,int key)
    {
        Tree node = getNode(root,key);
        int position = Math.abs(node.data-key);
        return position;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        int key = in.nextInt();
        System.out.print(getPosition(root,key));
    }
}
