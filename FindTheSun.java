/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author oyo
 */
public class FindTheSun {
    public static long getSun(long a[],long n)
    {
        Stack<Long> stack =  new Stack<>();
        stack.push(a[0]);
        for(int i=1;i<n;i++)
            if(a[i]>stack.peek())
                stack.push(a[i]);
        
        return stack.size();
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 long n = in.nextLong();
         long a[] = new long[(int)n];
         for(int i=0;i<n;i++)
             a[i]=in.nextLong();
         System.out.println(getSun(a,n));
	 
	 }
	 }
}
