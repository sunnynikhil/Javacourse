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
import java.util.Stack;
public class noofconnectedcomponentes {
    
    public static void fillorder(ArrayList<ArrayList<Integer>> list,boolean[] vis,int n,Stack<Integer> stack)
    {
        vis[n]=true;
        Iterator<Integer> it = list.get(n).iterator();
        while(it.hasNext())
        {
            int i = it.next();
            if(vis[i]==false)
                fillorder(list,vis,i,stack);
        }
        stack.push(n);
    }
    public static void dfs(int v , boolean[] vis,ArrayList<ArrayList<Integer>> list1 )
    {
        vis[v]=true;
        Iterator<Integer> it = list1.get(v).iterator();
        while(it.hasNext())
        {
            int i = it.next();
            if(vis[i]==false)
                dfs(i,vis,list1);
        }
    }
    public static ArrayList<ArrayList<Integer>> getreversed(ArrayList<ArrayList<Integer>> list,ArrayList<ArrayList<Integer>> list1,int V)
    {
        for(int i=0;i<V;i++)
            list1.add(i,new ArrayList<Integer>());
        for(int v=0;v<V;v++)
        {
           Iterator<Integer> it = list.get(v).iterator();
           while(it.hasNext())
           {
               int i=it.next();
               list1.get(i).add(v);
               
           }
        }
        return list1;
        
    }
    public static int kosaraju(ArrayList<ArrayList<Integer>> list,int n){
        boolean[] vis= new boolean[n];
        for(int i=0;i<n;i++)
            vis[i]=false;
        int count=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
            if(vis[i]==false)
                {
                    fillorder(list,vis,i,stack);
                    
                }
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        list1 = getreversed(list,list1,n);
        for(int i=0;i<n;i++)
            vis[i]=false;
        while(!stack.isEmpty())
        {
            int v = stack.pop();
            if(vis[v]==false)
            {
                dfs(v,vis,list1);
                count++;
                System.out.println();
                        
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    for(int i=0;i<r;i++)
    {
     list.add(i,new ArrayList<Integer>());
    }
   
        for(int j=0;j<c;j++)
        { int u = in.nextInt();
          int v = in.nextInt();
            list.get(u).add(v);
        }
    System.out.print(kosaraju(list,r));
    }
}
