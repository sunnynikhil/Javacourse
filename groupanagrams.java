/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import static javacourse.groupanagramns.getCountAnagrams;

/**
 *
 * @author oyo
 */
public class groupanagrams {
    
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
         List<List<String>> result =getGroupAnagrams(words);
         System.out.println(result);
	 
	 }
	 }

    private static List<List<String>> getGroupAnagrams(String[] words) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            if(map.containsKey(new String(ch)))
            {
                List<String> g = map.get(new String(ch));
                g.add(words[i]);
                map.put(new String(ch), g);
            }
            else
            {
              List<String> g = new ArrayList();
              g.add(words[i]);
              map.put(new String(ch), g);
              
            }
        }
        List<List<String>> result = new ArrayList();
        map.entrySet().stream().forEach((entry) -> {
            result.add(entry.getValue());
       });
        return result;
    }
}
