/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class SubstringwithConcatenationofAllWords {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++)
            words[i]=in.nextLine();
        List<Integer> list = findSubstring(str,words);
    }

    @SuppressWarnings("empty-statement")
    private static List<Integer> findSubstring(String str, String[] words) {

        List<Integer> res = new ArrayList<Integer>();
        
        if(str.length()==0||words.length==0)
            return res;
        int words_count = words.length;
        int word_length = words[0].length();
        int size_l = words_count*word_length;
        HashMap<String,Integer> hashmap = new HashMap<>();
        for(String s:words)
            hashmap.put(s, hashmap.getOrDefault(s, 0)+1);
        if(size_l>str.length())
            return res;
        for(int i=0;i<=str.length()-size_l;i++)
        {
            HashMap<String,Integer> tempmap = (HashMap<String,Integer>)hashmap.clone();
            int j=i,count=words_count;
            while(j<i+size_l)
            {
                String cur = str.substring(j, j+word_length);
                if(!hashmap.containsKey(cur)|| tempmap.get(cur)==0)
                {
                    break;
                }
                else
                {
                    tempmap.put(cur, tempmap.get(cur)-1);
                    count--;
                }
                j+=word_length;
            }
            if(count==0)
                res.add(i);
        }
        
        return res;
        
    }
}
