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
import java.util.LinkedList;
public class rotteneggs {
    static class ele{
        int x=0,y=0;
        ele(int x,int y)
        {
           this.x=x;
           this.y=y;
        }
    }
    static boolean isvaild(int i,int j,int n,int m)
    {
        return (i>=0 && j>=0 && i<n && j<m);
    }
    static boolean isend(ele temp)
    {
        return (temp.x==-1 && temp.y==-1);
    }
    public static int rotOranges(int a[][],int n,int m){
        int ans=0;
        ele temp;
        Queue<ele> q = new LinkedList<>();
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(a[i][j]==2)
                    q.add(new ele(i,j));
        q.add(new ele(-1,-1));
        while(!q.isEmpty())
        {
            boolean flag=false;
            while(!isend(q.peek()))
            {
                temp = q.peek();
                if(isvaild(temp.x+1,temp.y,n,m) && a[temp.x+1][temp.y]==1)
                {
                    if(!flag)
                    {
                        ans++;
                        flag=true;
                    }
                    a[temp.x+1][temp.y]=2;
                    temp.x++;
                    q.add(new ele(temp.x,temp.y));
                    temp.x--;
                    
                }
                if(isvaild(temp.x,temp.y+1,n,m) && a[temp.x][temp.y+1]==1)
                {
                    if(!flag)
                    {
                        ans++;
                        flag=true;
                    }
                    a[temp.x][temp.y+1]=2;
                    temp.y++;
                    q.add(new ele(temp.x,temp.y));
                    temp.y--;
                    
                }
                if(isvaild(temp.x-1,temp.y,n,m) && a[temp.x-1][temp.y]==1)
                {
                    
                     if(!flag)
                    {
                        ans++;
                        flag=true;
                    }
                    a[temp.x-1][temp.y]=2;
                    temp.x--;
                    q.add(new ele(temp.x,temp.y));
                    temp.x++;
                }
                if(isvaild(temp.x,temp.y-1,n,m) && a[temp.x][temp.y-1]==1)
                {
                    
                    if(!flag)
                    {
                        ans++;
                        flag=true;
                    }
                    a[temp.x][temp.y-1]=2;
                    temp.y--;
                    q.add(new ele(temp.x,temp.y));
                    temp.y++;
                }
                q.remove();
                
            }
            q.remove();
            if(!q.isEmpty())
                q.add(new ele(-1,-1));
        }
        if(checkall(a,n,m)==false)
            return -1;
        else
            return ans;
        
    }
    public static boolean checkall(int a[][],int n ,int m)
    {
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(a[i][j]==1)
                    return false;
        return true;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                a[i][j]=in.nextInt();
        }
        System.out.print(rotOranges(a,n,m));
    }
}
