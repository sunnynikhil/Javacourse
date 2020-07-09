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
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.*;
class LRUca{
    Set<Integer> cache;
    int capcity;
    LRUca(int c){
        this.capcity = c;
        this.cache = new LinkedHashSet<Integer>(capcity);
    }
}
public class LRUcache {
    
    public static void add(LRUca ca,int data){
       
        if(ca.cache.contains(data)==true)
        {
            ca.cache.remove(data);
            ca.cache.add(data);
        }
        else
        {
            if(ca.cache.contains(data))
                ca.cache.remove(data);
            
            else if(ca.capcity == ca.cache.size())
            {
                int first = ca.cache.iterator().next();
                ca.cache.remove(first);
            }
  
            ca.cache.add(data);
        }
        
        
    }
     public static void display(LRUca ca) 
    { 
        Iterator<Integer> itr = ca.cache.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
    } 
      
    public static void main(String[] args){
        LRUca ca = new LRUca(3);
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;i++)
        {
            add(ca,in.nextInt());
        }
        
        display(ca);
        
    }
    
}
