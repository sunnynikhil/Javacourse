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
import static javacourse.DFS.iscyclicundirected;
public class topoligcalsort {
    public static void topologicalsort(int v,ArrayList<ArrayList<Integer>> list,Stack<Integer> stack,boolean visted[]){
        visted[v]=true;
        Iterator<Integer> it = list.get(v).iterator();
        
        while(it.hasNext())
        {
            int i = it.next();
            if(!visted[i])
                topologicalsort(i,list,stack,visted);
        }
        stack.push(v);
    }
    public static int[] topological(ArrayList<ArrayList<Integer>> list,int v)
    {
        Stack<Integer> stack = new Stack<>();
        boolean visted[] = new boolean[v];
        for(int i=0;i<v;i++)
            visted[i]=false;
        for(int i=0;i<v;i++)
            if(!visted[i])
                topologicalsort(i,list,stack,visted);
        int res[]=new int[v];
        int k=0;
        while(!stack.empty())
        {
            res[k++]=stack.pop();
        }
        return res;
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
        }
        boolean visted[] = new boolean[vex];
        for(int i=0;i<vex;i++)
            visted[i]=false;
        int res[]=topological(list,vex);
        for(int i=0;i<vex;i++)
            System.out.print(res[i]);
    
    }
}
