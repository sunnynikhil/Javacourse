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
public class sumnumbers {
    
    public static int sumOfNumbers(String s)
     {
         String tmp="0";
         int sum=0;
         for(int i=0;i<s.length();i++)
         {
             char ch = s.charAt(i);
             if(Character.isDigit(ch))
                tmp+=ch;
             else
             {
                 sum+=Integer.parseInt(tmp);
                 tmp="0";
             }
         }
         sum+=Integer.parseInt(tmp);
         return sum;
     }
	public static void main (String[] args)
	 {
	
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
            String s = in.next();
            System.out.println(sumOfNumbers(s));
	 }
	 }
}
