/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class diagonalsumoftree {
    public static void diagonalSumUtil(Tree root,int d,HashMap<Integer,Vector<Integer>> map)
    {
        if(root==null)
             return;
        Vector<Integer> k = map.get(d);
        if(k==null)
        {
            k = new Vector<>();
            k.add(root.data);
            
        }
        else
        {
            k.add(root.data);
        }
        map.put(d, k);
        diagonalSumUtil(root.left,d+1,map);
        diagonalSumUtil(root.right,d,map);
    }
    public static void diagonalSum(Tree root)
    {
        HashMap<Integer,Vector<Integer>> map = new HashMap<>();
        diagonalSumUtil(root,0,map);
        for(Map.Entry<Integer,Vector<Integer>> entry : map.entrySet())
        {
            int sum=0;
            Object[] diagonals = entry.getValue().toArray();
            for(Object i:diagonals)
                sum+=(int)i;
            System.out.print(sum+" ");    
        }
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root=null;
        for(int i=0;i<n;i++)
            root = insert(root,in.nextInt());
        diagonalSum(root);
        
    }
}
