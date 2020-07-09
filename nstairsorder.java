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
public class nstairsorder {
    public static int Nstair(int n)
    {
        int a[] = new int[n+1];
        Arrays.fill(a,0);
        a[0]=1;
        for(int i=1;i<n+1;i++)
            a[i]=a[i]+a[i-1];
        for(int i=2;i<n+1;i++)
            a[i]=a[i]+a[i-2];
        return a[n];
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 System.out.println(Nstair(n));
	 }
	 }
}
