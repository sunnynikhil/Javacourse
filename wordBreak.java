/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class wordBreak {

    public static boolean wordBreak(String word, HashSet<String> set)
    {
        int n = word.length();
        if(n==0)
            return true;
        
        for(int i=1;i<=n;i++)
            if(set.contains(word.substring(0, i)) && wordBreak(word.substring(i,n),set))
                return true;
        return false;
    }
    public static boolean exitornot(String[] words,String key,int n)
    {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(words[i]);
        return wordBreak(key,set);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            String[] words = new String[n];
            for(int i=0;i<n;i++)
                words[i]=in.next();
            String key = in.next();
            System.out.println(exitornot(words,key,n));
        }
    }
}
