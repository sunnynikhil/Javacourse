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
public class reverseBits {
    
    public static long getReverseBit(int n)
    {
           long p = (long)Math.pow(2, 31);
           long sum=0;
           for(int i=0;i<32;i++)
           {
               long c=n%2;
               sum+=c*p;
               p=p/2;
               n=n/2;
           }
           return sum;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 System.out.println(getReverseBit(n));
	 }
	 }
}
