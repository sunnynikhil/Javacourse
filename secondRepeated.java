/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 *
 * @author oyo
 */


        
 class ValueComparator implements Comparator {
	Map map;
 
	public ValueComparator(Map map) {
		this.map = map;
	}
 
	public int compare(Object keyA, Object keyB) {
		Comparable valueA = (Comparable) map.get(keyA);
		Comparable valueB = (Comparable) map.get(keyB);
		return valueB.compareTo(valueA);
	}
}
public class secondRepeated {

    public static TreeMap<String, Integer> sortMapByValue(SortedMap<String, Integer> map){
		Comparator<String> comparator = new ValueComparator(map); 
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		result.putAll(map);
		return result;
	}

    public static String seconfMostRepeatedWord(String[] words,int n,int k)
     {
         SortedMap<String,Integer> map = new TreeMap<>();
         for(int i=0;i<n;i++)
         {
             if(!map.containsKey(words[i]))
                 map.put(words[i], 1);
             else
             {
                 map.put(words[i], map.get(words[i])+1);
             }
         }
        map = sortMapByValue(map);
         for(Map.Entry<String,Integer> entry : map.entrySet())
         {
             
             if(k-1==0)
                 return entry.getKey();
             k--;
             
         }
         return "";
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
	 System.out.println(seconfMostRepeatedWord(words,n,2));   
	 }
	 }

    
        
}
