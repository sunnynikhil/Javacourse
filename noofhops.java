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
public class noofhops {
    public static int noHops(int n)
    {
        if(n==1||n==0)
            return 1;
        else if(n==2)
            return 2;
        return noHops(n-3)+noHops(n-2)+noHops(n-1);
    }
    public static void main (String[] args)
	 {
	 
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         System.out.println(noHops(n));
	 
	 }
	 }
    
}
