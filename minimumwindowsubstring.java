/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class minimumwindowsubstring {
    public static String minWindow(String s , String t)
    {
        String ans="";
        int l1=s.length();
        int l2=t.length();
        if(l1<l2||l1==0 || l2==0)
            return "";
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<l2;i++)
        {
            int count=tmap.getOrDefault(t.charAt(i),0);
            tmap.put(t.charAt(i), count+1);
        }
        int start=0,min_index=Integer.MAX_VALUE,start_index=-1,count =0;
        for(int i=0;i<l1;i++)
        {
            int c = smap.getOrDefault(s.charAt(i),0);
            smap.put(s.charAt(i), c+1);
            
            if(tmap.getOrDefault(s.charAt(i),0)!=0 && smap.get(s.charAt(i))<=tmap.get(s.charAt(i)))
                count++;
            if(count==l2)
            {
                while(tmap.containsKey(s.charAt(start))== false || smap.get(s.charAt(start))>tmap.get(s.charAt(start)))
                {
                    if(tmap.containsKey(s.charAt(start))&&smap.get(s.charAt(start))>tmap.get(s.charAt(start)))
                    {
                        smap.put(s.charAt(start),smap.get(s.charAt(start))-1);
                        
                    }
                    start++;
                }
                int len = i-start+1;
                if(min_index>len)
                {
                    min_index=len;
                    start_index=start;
                }
                
            }
            
        }
        if(start_index==-1)
            return "";
        else
           return  s.substring(start_index, start_index+min_index);
    }
 public static void main(String[] args)
 {
     Scanner in = new Scanner(System.in);
     String txt = in.nextLine();
     String ptr = in.nextLine();
     System.out.print(minWindow(txt,ptr));
 }
}
