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
import java.util.Stack;
import java.util.ArrayList;
import java.util.Queue;
public class TopologicalSort {
    
    private int V =5;
    private LinkedList<Integer> adj[];
    
    TopologicalSort(int v){
        V = v;
        adj= new LinkedList[v];
        for(int i=0;i<V;i++)
        {
            adj[i]=new LinkedList();
            
        }
        
    }
    
    public void addEdge(int u,int v){
    adj[u].add(v);
    }
    
    public void topologicalSortUtil(int v, boolean vist[],Stack stack){
        
        vist[v]=true;
        Integer i;
        Iterator<Integer> it = adj[v].listIterator();
        
        while(it.hasNext()){
            i=it.next();
            if(!vist[i])
                topologicalSortUtil(i,vist,stack);    
        }
stack.push(new Integer(v)); 
    }
    public void topologicalSort(){
        
        boolean vist[]= new boolean[V];
        for(int i=0;i<V;i++)
            vist[i]=false;
        
        Stack stack = new Stack();
        
        for(int i=0;i<V;i++)
            if(!vist[i])
                topologicalSortUtil(i,vist,stack);
                        
                        
      while(stack.empty()==false)
          System.out.print(stack.pop());
             
    }
    public void kahns(){
        
        int indegree[] = new int[V];
        for(int i=0;i<V;i++)
            indegree[i]=0;
        for(int i=0;i<V;i++){
            Iterator<Integer> it = adj[i].listIterator();
            while(it.hasNext())
            {
               int y=it.next();
               indegree[y]++;
               
            }
        }
        
        Queue<Integer> q= new LinkedList<Integer>();
        
        for(int i=0;i<V;i++)
            if(indegree[i]==0)
                q.add(i);
        int count=0;
        Vector <Integer> topOrder=new Vector<Integer>(); 
        while(!q.isEmpty()){
            int v=q.poll();
            topOrder.add(v);
            for(int node : adj[v])
            {
                if(--indegree[node]==0)
                    q.add(node);
            }
            count++;
        }
        if(count!=V){
            System.out.println("There exists a cycle in the graph"); 
            return ; 
        }
        
        for(int node : topOrder)
            System.out.print(node);
        
    }
    public static void main(String[] args){
        
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        g.kahns(); 
        
    }
    
}
