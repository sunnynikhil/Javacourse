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
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList; 
import java.util.Iterator;
import java.util.*;

public class LRU {
    
    static Deque<Integer> dq;
    static HashSet<Integer> map;
    static int csize;
    
    LRU(int n){
        dq= new LinkedList<>();
        map= new HashSet<>();
        csize=n;
        
    }
    public static void refer(int n){
        
        if(!map.contains(n)){
            if(dq.size() == csize)
            {
                int last = dq.removeLast();
                map.remove(last);
            }
        }
        else{
            int index =0,i=0;
            Iterator<Integer> it = dq.iterator();
            while(it.hasNext()){
                if(it.next() == n)
                {
                    index=i;
                    break;
                }
                i++;
            }
            dq.remove(n);
        }
        dq.push(n);
        map.add(n);
    }
    public static void display(){
        Iterator<Integer> itr = dq.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        }
    }
    public static void main(String[] args ){
        LRU cache = new LRU(3);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            LRU.refer(in.nextInt());
        }
        LRU.display();
        
    }
    
}
