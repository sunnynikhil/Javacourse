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
public class occuernecesofanagrams {
    public static boolean countZero(int count[])
    {
        for(int i=0;i<26;i++)
            if(count[i]!=0)
                return false;
        return true;
    }
    public static int countOccureneces(String text,String pattern)
    {
        int res=0;
        int n1 = text.length();
        int n2 = pattern.length();
        int[] count = new int[26];
        Arrays.fill(count,0);
        for(int i=0;i<n2;i++)
        {
            count[pattern.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++)
        {
            count[text.charAt(i)-'a']--;
        }            
      
        if(countZero(count))
            res++;
        for(int i=n2;i<n1;i++)
        {
            count[text.charAt(i)-'a']--;
            count[text.charAt(i-n2)-'a']++;
            if(countZero(count))
                res++;
        }
        return res;
        
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String text  = in.next();
         String pattern = in.next();
         System.out.println(countOccureneces(text,pattern));
	 
	 }
	 }
    
}
