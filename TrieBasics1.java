/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;

/**
 *
 * @author oyo
 */

public class TrieBasics1 {
    
   static  class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
    TrieNode()
    {
        isEndOfWord = false;
        for(int i=0;i<26;i++)
           children[i]=null;
    }
}
   
    public static void insert(TrieNode root,String s)
    {
        if(s=="")
            return ;
        int index=0;
        TrieNode pCrawl = root;
        for(int i=0;i<s.length();i++)
        {
            index = s.charAt(i)-'a';
            if(pCrawl.children[index]==null)
                pCrawl.children[index] = new TrieNode();
            pCrawl = pCrawl.children[index]; 
                
        }
        pCrawl.isEndOfWord=true;
        
    }
    public static boolean search(TrieNode root,String s)
    {
        TrieNode pCrawl = root;
        for(int i=0;i<s.length();i++)
        {
            int index = s.charAt(i)-'a';
            if(pCrawl.children[index]==null)
                return false;
            pCrawl = pCrawl.children[index];
        }
        return (pCrawl.isEndOfWord==true && pCrawl!=null);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            TrieNode root = new TrieNode();
            String[] keys = new String[n];
            for(int i=0;i<n;i++)
                keys[i]=in.next();
            for(int i=0;i<n;i++)
                insert(root,keys[i]);
            String serach = in.nextLine();
            System.out.print(search(root,serach));
        }
    }
    
}
