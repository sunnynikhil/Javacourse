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
public class convertTodecmial {
    
    public static String convertToDecimal(String s)
     {
         int arr[] = new int[26];
         int k=0;
         for(int i=2;i<=9;i++)
         {
             arr[k++]=i;
             arr[k++]=i;
             arr[k++]=i;
             if(i==7 || i==9)
               arr[k++]=i;
         }
         String res = "";
         for(int i=0;i<s.length();i++)
            res+=arr[s.charAt(i)-'a'];
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
	 System.out.println(convertToDecimal(s));
	 
	 
	 }
	 }
}
