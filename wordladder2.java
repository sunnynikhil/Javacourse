/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author oyo
 */
public class wordladder2 {
    
    public static boolean isadj(String a , String b){
         int count = 0;  
    for (int i = 0; i < a.length(); i++)  
    {  
        if (a.charAt(i) != b.charAt(i))  
            count++;  
    }  
    if (count == 1)  
        return true;  
    return false;           
    }
    public static class item {
        String word;
        int len;
        item(String word,int len){
            this.word = word;
            this.len=len;
        }
    }
    public static int shortestChainLen(String start,String target,ArrayList<String> D){
        
        Queue<item> q1 = new LinkedList<>();
        Queue<item> q2 = new LinkedList<>();
        HashMap<String , Integer> vist1 = new HashMap<>();
        HashMap<String , Integer> vist2 = new HashMap<>();
        
        item first = new item(start,1);
        item last = new item(target , 1);
        vist1.put(start, 1);
        q1.add(first);
        vist2.put(target,1);
        q2.add(last);
        
        while(q1.size()>0 && q2.size()>0){
            
            item node1 = q1.remove();
            item node2 = q2.remove();
            for(int i=0;i<D.size();i++){
                if(isadj(node1.word,D.get(i)) && vist1.containsKey(D.get(i))==false)
                {
                    item temp = new item(D.get(i),node1.len+1);
                    vist1.put(D.get(i),node1.len+1);
                    q1.add(temp);
                    
                    if(temp.word.equals(target))
                        return temp.len+1;
                    if(vist2.containsKey(temp.word))
                        return temp.len+vist2.get(temp.word)-1;
                }
            }
            for(int i=0;i<D.size();i++){
                if(isadj(node2.word,D.get(i))&& vist2.containsKey(D.get(i))==false){
                    item temp = new item(D.get(i),node2.len+1);
                    vist2.put(D.get(i), node2.len+1);
                    q2.add(temp);
                    if(temp.word.equals(target))
                        return temp.len+1;
                    if(vist1.containsKey(temp.word))
                        return temp.len+vist1.get(temp.word)-1;
                }
            }
        }
        
        return 0;
    }
    public static void main(String[] args){

           ArrayList<String> D = new ArrayList<String>();
           D.add("poon"); 
           D.add("plee"); 
           D.add("same"); 
           D.add("poie"); 
           D.add("plie"); 
           D.add("poin"); 
           D.add("plea"); 
           String start = "toon"; 
           String target = "plea";
           System.out.print("Length of shortest chain is: "
           + shortestChainLen(start, target, D)); 
       }   
}
