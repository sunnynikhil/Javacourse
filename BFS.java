/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;
import java.util.LinkedList;
/**
 *
 * @author oyo
 */
public class BFS {
    
    private int V;
    private LinkedList<Integer> adj[];
    
    BFS(int v){
        V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++)
            adj[i] = new LinkedList();
    }
    
    public  void addEdge(int u, int v){
        adj[u].add(v);
    }
    
    public void BFS(int s){
        
        boolean vist[] = new boolean[V];
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        vist[s]=true;
        
        while(!queue.isEmpty()){
            s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(vist[n]== false)
                {
                    vist[n]=true;
                    queue.add(n);
                }
            }
        }
        
        
        
    }
    public  void dfsstack(int v,boolean vist[]){
        
        vist[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!vist[n])
                dfsstack(n,vist);
        }
        
    } 
    public void DFS(){
        boolean vist[] = new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(vist[i]== false)
                dfsstack(i,vist);
        }
        
    }
    private boolean iscyclicutil(int i, boolean[] vist, boolean[] stack) {
          
        if(stack[i])
            return true;
        if(vist[i])
            return false;
        vist[i]=true;
        stack[i]=true;
        Iterator<Integer> nodes = adj[i].listIterator();
        while(nodes.hasNext()){
            int v=nodes.next();
            if(iscyclicutil(v,vist,stack))
                return true;
        }
        
        return false;
                  
    }
    
    public boolean  iscyclicDFSutil(int v, boolean[] vist,int parent){
        
        vist[v] = true;
        int i=0;
        Iterator<Integer> it = adj[v].listIterator();
        while(it.hasNext()){
            
            i=it.next();
            if(!vist[i])
                if(iscyclicDFSutil(i,vist,v))
                    return true;
                else if(i!=parent)
                    return true;
            
        }
        
        return false;
    } 
    
    public boolean iscyclic(){
        boolean vist[] = new boolean[V];
        boolean stack[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(iscyclicutil(i,vist,stack))
                return true;
        }
        return false;
    }
    
    public boolean isDFScyclic(){
        boolean vist[] = new boolean[V];
        for(int i=0;i<V;i++)
            vist[i]=false;
        
        for(int i=0;i<V;i++){
            if(iscyclicDFSutil(i,vist,-1))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        
        BFS g = new BFS(4);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        g.BFS(2);
        System.out.println();
        if(g.isDFScyclic())
            System.out.print("YES");
        else
            System.out.print("NO");
        
    }

    
}
