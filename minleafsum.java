/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Vector;
import static javacourse.deleteBST.insert;
import static javacourse.printRange.printRange;

/**
 *
 * @author oyo
 */
public class minleafsum {
    public static boolean isLeaf(Tree root)
    {
        return root.left==null && root.right==null;
    }
    public static void minLeafSumUtil(Tree root,int level,SortedMap<Integer,Vector<Integer>> map)
    {
        if(root==null)
            return;
        if(isLeaf(root))
        {
            Vector<Integer> g = map.get(level);
            if(g==null)
            {
                g = new Vector<Integer>();
            }
            g.add(root.data);
            map.put(level, g);
            
        }
        else
        {
            minLeafSumUtil(root.left,level+1,map);
            minLeafSumUtil(root.right,level+1,map);
        }
    }
    public static int minLeafSum(Tree root)
    {
        SortedMap<Integer,Vector<Integer>> map = new TreeMap<>();
        minLeafSumUtil(root,0,map);
        int ans=0;
        for(Map.Entry<Integer,Vector<Integer>> entry : map.entrySet())
        {
            Vector<Integer> g = entry.getValue();
            for(Integer i : g)
                ans+=i;
            return ans;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tree root = null;
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());        
        System.out.println(minLeafSum(root));
        
    }
}
