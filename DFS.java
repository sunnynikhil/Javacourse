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
public class DFS {
    
    
    public static void dfs(int s,ArrayList<ArrayList<Integer>> list, boolean visted[])
    {
        visted[s]=true;
        System.out.print(s+" ");
        Iterator<Integer> it = list.get(s).iterator();
        while(it.hasNext())
        {
            int temp = it.next();
            if(visted[temp]==false)
            {
                dfs(temp,list,visted);
            }
        }
        return;
    }
    
    public static void bfs(int s,ArrayList<ArrayList<Integer>> list,boolean visted[],int v ){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visted[s]=true;
        while(!queue.isEmpty())
        {
            int temp = queue.poll();
           
            System.out.print(temp+" ");
            Iterator<Integer> it = list.get(temp).iterator();
            while(it.hasNext())
            {
                int t=it.next();
                if(visted[t]==false)
                {
                    visted[t]=true;
                    queue.add(t);
                }
            }
        }
        return;
    }
    public static boolean iscyclicutil(int i,ArrayList<ArrayList<Integer>> list, boolean visted[],boolean restack[])
    {
        if(restack[i])
            return true;
        if(visted[i])
            return false;
        visted[i]=true;
        restack[i]=true;
        
        List<Integer> child = list.get(i);
        System.out.print(child);
        for(Integer  c : child)
            if(iscyclicutil(c,list,visted,restack))
                return true;
        restack[i]=false;
        return false;
    }
    public static boolean iscyclicutildirected(int i,ArrayList<ArrayList<Integer>> list, boolean visted[],int parent)
    {
        visted[i]=true;
        Iterator<Integer> it = list.get(i).iterator();
        while(it.hasNext())
        {
            int temp = it.next();
            if(!visted[temp])
            { if(iscyclicutildirected(temp,list,visted,i))
                    return true;
            }
            else if(temp!=parent)
                return true;
            
                
        }
        return false;
        
    }
    public static boolean iscyclic(ArrayList<ArrayList<Integer>> list, int v){
        boolean visted[] = new boolean[v];
        boolean restack[] = new boolean[v];
        for(int i=0;i<v;i++)
            if(iscyclicutil(i,list,visted,restack))
                return true;
        return false;
    }
    public static boolean iscyclicundirected(ArrayList<ArrayList<Integer>> list, int v){
        boolean visted[] = new boolean[v];
        for(int i=0;i<v;i++)
            visted[i]=false;
        for(int i=0;i<v;i++)
            if(!visted[i])
              if(iscyclicutildirected(i,list,visted,-1))
                return true;
        return false;
    }
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int vex=in.nextInt();
        int edg = in.nextInt();
        for(int i=0;i<vex;i++)
            list.add(new ArrayList<Integer>());
        for(int i=1;i<=edg;i++)
        {
            int u=in.nextInt();
            int v = in.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
            
        }
        boolean visted[] = new boolean[vex];
        for(int i=0;i<vex;i++)
            visted[i]=false;
//        bfs(0,list,visted,vex);
        System.out.print(iscyclicundirected(list,vex));
    
    
    }
    
    
}
