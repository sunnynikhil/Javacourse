/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class noofislandsarraylist {
    
    
    public static int noofislands(ArrayList<ArrayList<Integer>> list,int n,int m){
    
        ArrayList<ArrayList<Boolean>> vis = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Boolean> temp = new ArrayList<>();
            vis.add(i,temp);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                vis.get(i).add(j,false);
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis.get(i).get(j)==false&& list.get(i).get(j)==1)
                {
                    noofislandsutil(list,i,j,vis,n,m);
                    count++;
                }
            }
        }
    return count;
    }
    
    
    public static void noofislandsutil(ArrayList<ArrayList<Integer>> list,int i,int j,ArrayList<ArrayList<Boolean>> vis,int n,int m){
        int row[] = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
        int col[] = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
        vis.get(i).set(j,true);
        
        for(int k=0;k<8;k++)
        {
            if(isSafe(list,i+row[k],j+col[k],vis,n,m)==true)
                noofislandsutil(list,i+row[k],j+col[k],vis,n,m);
        }
    }
    public static boolean isSafe(ArrayList<ArrayList<Integer>> list,int i,int j,ArrayList<ArrayList<Boolean>> vis,int n,int m){
        return (i>=0)&&(i<n)&&(j>=0)&&(j>m)&&((list.get(i).get(j)==1) && vis.get(i).get(j)==false);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(i,temp);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                list.get(i).add(j,in.nextInt());
            }
        }
        System.out.print(noofislands(list,n,m));
    }
}
