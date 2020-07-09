/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Scanner;
import static javacourse.deleteBST.insert;

/**
 *
 * @author oyo
 */
public class widthoftree {
    static int max;
    public static void getWidthUtil(Tree root,int level,HashMap<Integer,Integer> map)
    {
        if(root==null)
            return;
        if(map.containsKey(level))
        {
            map.put(level, map.get(level)+1);
            int count = map.get(level);
            if(count>max)
                max=count;
        }
        else
        {
            map.put(level,1);
            if(max<1)
                max=1;
        }
        getWidthUtil(root.left,level+1,map);
        getWidthUtil(root.right,level+1,map);
    }
    public static int getWidth(Tree root)
    {
        max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        getWidthUtil(root,0,map);
        return max;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree root = null;
        for(int i=0;i<n;i++)
            root=insert(root,in.nextInt());
        System.out.print(getWidth(root));
    }
}
