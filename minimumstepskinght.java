/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
import java.util.Vector;
public class minimumstepskinght {
    
    static class cell{
        int x,y,dis;
        cell(int x,int y,int dis)
        {
            this.x=x;
            this.y=y;
            this.dis=dis;
        }     
    }
    public static boolean isvaild(int i,int j,int n)
    {
        return (i>=1)&&(i<=n)&&(j>0)&&(j<=n);
    }
    public static int minimumsteps(int p[],int t[],int n)
    {
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};  
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        Vector<cell>  q = new Vector<>();
        q.add(new cell(p[0],p[1],0));
        boolean vis[][] = new boolean[n+1][n+1];
        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j++)
                vis[i][j]=false;
        vis[p[0]][p[1]]=true;
        cell temp;
        while(!q.isEmpty())
        {
            temp = q.firstElement();
            q.remove(0);
            if(temp.x==t[0] && temp.y == t[1])
                return temp.dis;
            for(int i=0;i<8;i++)
            {
                int x = temp.x+dx[i];
                int y = temp.y + dy[i];
                if(isvaild(x,y,n) && vis[x][y]==false)
                {
                    vis[x][y]=true;
                    q.add(new cell(x,y,temp.dis+1));
                    
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p[]=new int[2];
        p[0]=in.nextInt();
        p[1]=in.nextInt();
        int t[]=new int[2];
        t[0]=in.nextInt();
        t[1]=in.nextInt();
        System.out.print(minimumsteps(p,t,n));
    }
}
