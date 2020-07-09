/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.noofislands.noofislandsutil;
import static javacourse.rotteneggs.rotOranges;

/**
 *
 * @author oyo
 */
public class unitarea {
    public static int unitareautil(int a[][],int i,int j,int n,int m, boolean vis[][])
    {
        if(i>=n|| i<0)
            return 0;
        if(j>=m||j<0)
            return 0;
        if(a[i][j]==-1 || vis[i][j]==true)
            return 0;
//        System.out.println("--i: "+i+"--j: "+j+" value:"+list.get(i).get(j));
        if(a[i][j]==1)
        {   int r =0;
            vis[i][j]=true;
            r+=unitareautil(a,i-1,j-1,n,m,vis)+1;
            r+=unitareautil(a,i-1,j,n,m,vis)+1;
            r+=unitareautil(a,i-1,j+1,n,m,vis)+1;
            r+=unitareautil(a,i,j+1,n,m,vis)+1;
            r+=unitareautil(a,i+1,j,n,m,vis)+1;
            r+=unitareautil(a,i+1,j-1,n,m,vis)+1;
            r+=unitareautil(a,i+1,j+1,n,m,vis)+1;
            r+=unitareautil(a,i,j-1,n,m,vis)+1;
            return r;
        }
        else
         return 0;
    }
    public static int unitarea(int a[][],int n ,int m, boolean[][] vis){
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1 && vis[i][j]==false)
                {
                    ans=unitareautil(a,i,j,n,m,vis);
                    if(max<(ans/8))
                        max=ans/8;
                }
            }
        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        boolean vis[][] = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            { 
                a[i][j]=in.nextInt();
                vis[i][j]=false;
            }
        }
        System.out.print(unitarea(a,n,m,vis));
    }
}
