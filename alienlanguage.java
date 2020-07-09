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
import java.util.Queue;


    public class alienlanguage {
     public  static void printwords(String words[],int size){
         int indegree[] = new int[26];
         Map<Character,Set<Character>> g = new HashMap<>();
         buildgraph(g,indegree,words);
         System.out.println(g);
         for(int i=0;i<26;i++)
             System.out.print(indegree[i]);
         topo(g,indegree);
     }
     private static void topo(Map<Character,Set<Character>> g , int indegree[])
     {
         
         StringBuilder sb = new StringBuilder();
         int totalchars = g.size();
         Queue<Character> q = new LinkedList<>();
         for(char c : g.keySet()){
             if(indegree[c-'a']==0){
                 sb.append(c);
                 q.offer(c);
             }
         }
         
         while(!q.isEmpty()){
             char c = q.poll();
             if(g.get(c)==null || g.get(c).size()==0) continue;
             
             for(char n :g.get(c))
             {
                 indegree[n-'a']--;
                 if(indegree[n-'a']==0)
                 {
                     q.offer(n); 
                     sb.append(n);
                 }
             }
         }
         
        System.out.println(sb.toString());
     }
     private static void buildgraph(Map<Character,Set<Character>> g , int indegree[],String words[]){
         
         for(String word : words){
             for(char c : word.toCharArray())
                 g.putIfAbsent(c, new HashSet<>());   
         }
         System.out.println(g);
         for(int i=1;i<words.length;i++)
         {
             
            String first = words[i-1];
            String second = words[i];
            for(int j=0;j<Math.min(first.length(), second.length());j++){
                System.out.println("first="+first+" second="+second);
                if(first.charAt(j)!=second.charAt(j)){
                    System.out.println("first="+first.charAt(j)+" second="+second.charAt(j));
                    if(!g.get(first.charAt(j)).contains(second.charAt(j))){
                        g.get(first.charAt(j)).add(second.charAt(j));
                        indegree[second.charAt(j)-'a']++;
                    }
                    break;
                }
                    
         }
         } 
     }
     public static void main(String[] args){
         String words[] = {"baa", "abcd", "abca", "cab", "cad"};
         printwords(words,3);
     }
    
             
}
