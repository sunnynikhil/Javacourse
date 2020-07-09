/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class singlenumber {
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 long n = in.nextLong(),x=0,data;
        
         for(long i =0;i<n;i++)
         {
             data=in.nextLong();
             x=x^data;
         }
         System.out.println(x);
	 
	 }
	 }
}
