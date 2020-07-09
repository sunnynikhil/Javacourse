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
import java.util.HashSet;
import java.util.Deque;
import java.util.LinkedList;
import java.util.*;
public class lruchache {
    private Deque<Integer> dq;
    private HashSet<Integer> map;
    private int size;
    
    public lruchache(int n){
        dq = new LinkedList<Integer>();
        map = new HashSet<Integer>();
        size=n;
    }
    public void push(int n){
        if(!map.contains(n)){
            if(map.size()==size){
                int key =dq.removeLast();
                map.remove(key);
            }
        }
        else
        {
            Iterator<Integer> it = dq.iterator();
            int index=0;
            int i=0;
            while(it.hasNext()){
                int key =it.next();
                if(key==n)
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
    public void print(){
        Iterator<Integer> it = dq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
    public static void main(String[] args){
        lruchache LRU = new lruchache(3);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            LRU.push(in.nextInt());
        LRU.print();        
    }
}
