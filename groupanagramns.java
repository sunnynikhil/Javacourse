/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author oyo
 */
public class groupanagramns {
    public static void getCountAnagrams(String words[],int n)
    {
        SortedMap<String ,Integer> map;
        map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String tmp = new String(ch);
//            System.out.println("String sotred:"+tmp);
            if(map.containsKey(tmp))
                map.put(tmp, map.get(tmp)+1);
            else
                map.put(tmp, 1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.print(entry.getKey()+" "+entry.getValue()+" ");
        }
            
            
       
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         String[] words = new String[n];

         for(int i=0;i<n;i++)
             words[i]=in.next();
//         System.out.print("word:"+words[1]);
         getCountAnagrams(words,n);
         System.out.println();
	 
	 }
	 }
}
