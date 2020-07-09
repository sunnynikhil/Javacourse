/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;
import static javacourse.topoligcalsort.topological;

/**
 *
 * @author oyo
 */
public class noofislands {
    public static void noofislandsutil( int [][]a,int i,int j,int n,int m){
        
        if(i>=n|| i<0)
            return;
        if(j>=m||j<0)
            return;
        if(a[i][j]==-1)
            return;
//        System.out.println("--i: "+i+"--j: "+j+" value:"+list.get(i).get(j));
        if(a[i][j]==1)
        { 
            a[i][j]=-1;
            noofislandsutil(a,i-1,j-1,n,m);
            noofislandsutil(a,i-1,j,n,m);
            noofislandsutil(a,i-1,j+1,n,m);
            noofislandsutil(a,i,j+1,n,m);
            noofislandsutil(a,i+1,j,n,m);
            noofislandsutil(a,i+1,j-1,n,m);
            noofislandsutil(a,i+1,j+1,n,m);
            noofislandsutil(a,i,j-1,n,m);
        }
        else
         return;
        
        
    }
    public static int noofislands(int [][] list,int n,int m){
        int count=0;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//                System.out.println("--i: "+i+"--j: "+j+" value:"+list.get(i).get(j));
//            System.out.println();
//        
//        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                if(list[i][j]==1)
                {   
                    count++;
                    noofislandsutil(list,i,j,n,m);
                }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int vex=in.nextInt();
        int edg = in.nextInt();
        int a[][] = new int[vex][edg];
//        for(int i=0;i<vex;i++)
//            list.add(i,new ArrayList<Integer>());       
        for(int j=0;j<vex;j++)
            for(int i=0;i<edg;i++)
        {
            
            a[j][i]=in.nextInt();            
        }
//        for(int i=0;i<vex;i++)
//        {
//            for(int j=0;j<edg;j++)
//                System.out.println(list.get(i).get(j)+"--i: "+i+"--j: "+j);
//            System.out.println();
//        
//        }
        System.out.println(noofislands(a,vex,edg));
        System.out.println("break");
//        for(int i=0;i<vex;i++)
//        {
//            for(int j=0;j<edg;j++)
//                System.out.print(list.get(i).get(j));
//            System.out.println();
//        
//        }
    
    }
}
