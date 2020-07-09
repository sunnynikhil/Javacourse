/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;

/**
 *
 * @author oyo
 */
public class countallsubstrings {
    static class suffixtreenode{
        
        static final int MAX_CHAR = 26; 
        suffixtreenode[] children = new suffixtreenode[MAX_CHAR];
        suffixtreenode(){
                    for(int i=0;i<MAX_CHAR;i++)
                      children[i]=null;
                  }
        void insertsubstring(String s)
        {
            if(s.length()>0)
            {
                char index = (char) (s.charAt(0)-'a');
                if(children[index]==null)
                    children[index] = new suffixtreenode();
                
                children[index].insertsubstring(s.substring(1));
            }
        }
    }
    static class suffixtree{
        static final int MAX_CHAR = 26; 
        suffixtreenode root; 
        
        suffixtree(String s)
        {
            root = new suffixtreenode();
            for(int i=0;i<s.length();i++)
                root.insertsubstring(s.substring(i));
            
        }
        int counttreenodes(suffixtreenode root)
        {
            if(root==null)
                return 0;
            int count=0;
            for(int i=0;i<26;i++)
                if(root.children[i]!=null)
                    count+=counttreenodes(root.children[i]);
            return count+1;
        }
        int countsubstrings()
        {
            return counttreenodes(root);
        }
        
    }
    public static int countSubstrings(String s)
    {
        suffixtree root = new suffixtree(s);
        return root.countsubstrings();
    }
    public static void main(String[] args) 
    { 
        String str = "ab"; 
        System.out.print(countSubstrings(str)); 
    } 
}
