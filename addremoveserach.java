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
public class addremoveserach {
    ArrayList<Integer> arr;
    HashMap <Integer , Integer> hash;
    
    public addremoveserach(){
        arr = new ArrayList<Integer>();
        hash = new HashMap<Integer , Integer>();    
    }
    public void add(int data){
        if(hash.get(data)!=null)
            return;
        int s = arr.size();
        arr.add(data);
        hash.put(data,s);
    }
    public void remove(int data){
        Integer index = hash.get(data);
        if(index==null)
            return;
        hash.remove(data);
        int size = arr.size();
        Integer last = arr.get(size-1);
        Collections.swap(arr, index, size-1);
        
        arr.remove(size-1);
        hash.put(last, data);
        
    }
    public int search(int x)
    {
        return hash.get(x);
    }
    public int getRand(){
        Random rand = new Random();
        Integer index = rand.nextInt(arr.size());
        return arr.get(index);
        
    }
    public static void main(String[] args){
        addremoveserach ds = new addremoveserach();
        ds.add(10);
        ds.add(20);
        ds.add(30);
        ds.add(40);
//        ds.add(50);
        ds.remove(20);
        System.out.println(ds.search(30)); 
        ds.remove(20); 
        ds.add(50); 
        System.out.println(ds.search(50)); 
        System.out.println(ds.getRand()); 
        
    }
}
