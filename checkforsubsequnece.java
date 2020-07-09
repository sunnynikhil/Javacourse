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
public class checkforsubsequnece {
    public static boolean isSubsequnce(String a,String b,int m,int n)
    {
         if(m==0)
             return true;
         if(n==0)
             return false;
         if(a.charAt(m-1)==b.charAt(n-1))
             return isSubsequnce(a,b,m-1,n-1);
         return isSubsequnce(a,b,m,n-1);
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String a = in.next();
         String b = in.next();
         if(isSubsequnce(a,b,a.length(),b.length()))
             System.out.println("1");
         else
             System.out.println("0");
	 
	 }
	 }
}
