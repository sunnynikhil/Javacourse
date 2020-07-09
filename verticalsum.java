/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import static javacourse.deleteBST.insert;
import static javacourse.deleteBST.print;
import static javacourse.sumleaf.findsum;

/**
 *
 * @author oyo
 */

public class verticalsum {
    public static void calsum(Tree root,int dist,TreeMap<Integer,Integer> map){
        if(root==null)
            return;
        if(map.containsKey(dist))
            map.put(dist, map.get(dist)+root.data);
        else
            map.put(dist, root.data);
        calsum(root.left,dist-1,map);
        calsum(root.right,dist+1,map);
        
    }
    public static void verticalsum(Tree root){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        calsum(root,0,map);
        for(Entry<Integer,Integer> entry : map.entrySet())
            System.out.print(entry.getValue()+" ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root  = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());

        verticalsum(root);
        
    }
}
