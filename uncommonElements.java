/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class uncommonElements {
    public static String getUncommonElements(String a,String b)
    {
        int count[] = new int[26];
        int count1[] = new int[26]; 
        Arrays.fill(count,0);
        Arrays.fill(count1,0);
        for(int i=0;i<a.length();i++)
        {
            if(count[a.charAt(i)-'a']==0)
                count[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            if(count1[b.charAt(i)-'a']==0)
                count1[b.charAt(i)-'a']++;
        }
        String s="";
        for(int i=0;i<26;i++)
        {
            if(count[i]!=count1[i])
            {
                char c = (char) ((char)i+97);
                s+=c;
                
            }
        }
        return s;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String s1 = in.next();
         String s2 = in.next();
         System.out.println(getUncommonElements(s1,s2));
	 
	 }
	 }
}
