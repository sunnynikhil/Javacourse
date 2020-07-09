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
public class romantoint {
    public static int value(char c)
    {
        switch(c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            
             
        }
        return -1;
    }
    public static String convertInttoRoman(int n)
    {
        String m[] = {"", "M", "MM", "MMM"}; 
        String c[] = {"", "C", "CC", "CCC", "CD", "D",  
                            "DC", "DCC", "DCCC", "CM"}; 
        String x[] = {"", "X", "XX", "XXX", "XL", "L",  
                            "LX", "LXX", "LXXX", "XC"}; 
        String i[] = {"", "I", "II", "III", "IV", "V",  
                            "VI", "VII", "VIII", "IX"}; 
        String thousands = m[n/1000]; 
        String hundereds = c[(n%1000)/100]; 
        String tens = x[(n%100)/10]; 
        String ones = i[n%10]; 
              
        String ans = thousands + hundereds + tens + ones; 
              
        return ans; 
    }
    public static int convertRomanToInt(String s)
    {
        int res =0;
        for(int i=0;i<s.length();i++)
        {
            int s1 = value(s.charAt(i));
            if(i+1<s.length())
            {
                int s2 = value(s.charAt(i+1));
                if(s1>=s2)
                    res+=s1;
                else
                {
                    res+=s2-s1;
                    i++;
                }
                    
            }
            else
            {
                res+=s1;
                i++;
            }
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
	 
	  String s = in.next();
          System.out.println(convertRomanToInt(s));
	 }
	 }
}
