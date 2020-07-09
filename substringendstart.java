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
public class substringendstart {
    public static boolean isVaild(String s)
    {
        if("".equals(s))
            return false;
       return s.charAt(0)==s.charAt(s.length()-1); 
    }
    public static int countSubstrings(String s,int n)
    {
        if(s=="")
            return 0;
        int count=0;
        for(int i=0;i<=s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                if(isVaild(s.substring(i, j)))
                    count++;
                
            }
        }
        return count;
    }
    static int countSubstringWithEqualEnds(String s) 
    { 
        int result = 0; 
        int n = s.length(); 
       
        // Calculating frequency of each character 
        // in the string. 
        int[] count =  new int[26]; 
        for (int i = 0; i < n; i++) 
            count[s.charAt(i)-'0']++; 
       
        // Computing result using counts 
        for (int i = 0; i < 26; i++) 
            result += (count[i] * (count[i] + 1) / 2); 
       
        return result; 
    } 
    public static void main (String[] args)
	 {
	 
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 String s = in.next();
         System.out.println(countSubstringWithEqualEnds(s));
	 }
	 }
}
