/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import static javacourse.rotteneggs.checkall;
/**
 *
 * @author oyo
 */
public class rottenoragnes {
    static class demil
            {
        int x,y;
        demil(int x,int  y)
        {
            this.x=x;
            this.y=y;
        }

        private demil() {
             //To change body of generated methods, choose Tools | Templates.
        }
    }
    public static boolean isdemil(demil p)
    {
        if(p.x==-1 && p.y==-1)
            return true;
        return false;
    }
    public static int getNoOfUnits(int[][] a,int n,int m)
    {
        int count=0;
        Queue<demil> stack = new LinkedList<>();
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(a[i][j]==2)
                    stack.add(new demil(i,j));
        stack.add(new demil(-1,-1));
        while(!stack.isEmpty())
        {
            
            boolean flag=true;
            while(!isdemil(stack.peek()))
            {
                demil temp = stack.remove();
                if(isVaild(temp.x+1,temp.y,n,m) && a[temp.x+1][temp.y]==1)
                {
                    if(flag)
                    {
                        count++;
                        flag=false;
                    }
                    a[temp.x+1][temp.y]=2;
                    stack.add(new demil(temp.x+1,temp.y));
                }
                if(isVaild(temp.x,temp.y+1,n,m) && a[temp.x][temp.y+1]==1)
                {
                    if(flag)
                    {
                        count++;
                        flag=false;
                    }
                    a[temp.x][temp.y+1]=2;
                    stack.add(new demil(temp.x,temp.y+1));
                }
                if(isVaild(temp.x-1,temp.y,n,m) && a[temp.x-1][temp.y]==1)
                {
                    if(flag)
                    {
                        count++;
                        flag=false;
                    }
                    a[temp.x-1][temp.y]=2;
                    stack.add(new demil(temp.x-1,temp.y));
                }
                if(isVaild(temp.x,temp.y-1,n,m) && a[temp.x][temp.y-1]==1)
                {
                    if(flag)
                    {
                        count++;
                        flag=false;
                    }
                    a[temp.x][temp.y-1]=2;
                    stack.add(new demil(temp.x,temp.y-1));
                }
                
                
            }
            stack.remove();
            if(!stack.isEmpty())
                stack.add(new demil(-1,-1));
        }
        if(checkall(a,n,m)==false)
            return -1;
        return count;
    }
    public static boolean isVaild(int x,int y,int n,int m)
    {
        if(x<0 || x>=n || y<0 ||y>=m)
            return false;
        return true;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a = new int[n][m];
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    a[i][j]=in.nextInt();
            System.out.println(getNoOfUnits(a,n,m));
        }
    }
}
