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



public class TrieBasics {
    
   static class TrieNode{
        TrieNode children[] = new TrieNode[SIZE];
        boolean isEndOfWord = false;
        TrieNode()
        {
            boolean isEndOfWOrd=false;
            for(int i=0;i<SIZE;i++)
                children[i]=null;
        }
    } 
static int SIZE= 26;
static TrieNode root;
public static void insert(TrieNode root,String key){
    int length = key.length();
    TrieNode pCrawl = root;
    int index;
    for(int i=0;i<length;i++)
    {
        index = key.charAt(i)-'a';
        if(pCrawl.children[index]==null)
            pCrawl.children[index]=new TrieNode();
        pCrawl=pCrawl.children[index];
        
    }
    pCrawl.isEndOfWord=true;
}
public static boolean search(TrieNode root,String key)
{
    int length = key.length();
    TrieNode pCrawl = root;
    int index;
    for(int i=0;i<length;i++)
    {
        index = key.charAt(i)-'a';
        if(pCrawl.children[index]==null)
            return false;
        pCrawl= pCrawl.children[index];
    }
    return (pCrawl!=null && pCrawl.isEndOfWord==true);
}
public static boolean removeUtil(TrieNode curNode,String key,int level,int length )
{
    if(curNode== null)
    {
        System.out.print("key doesn't exists");
        return false;
    }
    if(level==length)
    {
        if(nodeHasNoChild(curNode))
            return true;
        else
            return false;
    }
    else
    {
        TrieNode childNode = curNode.children[key.charAt(level)-'a'];
        boolean deleteNode = removeUtil(childNode,key,level+1,length);
        if(deleteNode)
        {
            return (curNode.isEndOfWord &&nodeHasNoChild(curNode));
        }
    }
    return false;
}
public static boolean nodeHasNoChild(TrieNode node)
{
    for(int i=0;i<node.children.length;i++)
        if(node.children[i]!=null)
            return false;
    return true;
}
public static void remove(TrieNode root,String key)
{
    int length = key.length();
    if(length>0)
        removeUtil(root,key,0,length);
}
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] keys = new String[n];
    for(int i=0;i<n;i++)
    {
        keys[i]=in.nextLine();
    }
    for(int i=0;i<n;i++)
        insert(root,keys[i]);
    remove(root,"the");
    
}
    
}
