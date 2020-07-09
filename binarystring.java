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
public class binarystring {
    public static int getCount(String s,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {  if(s.charAt(i)=='1')
            count++;
         }
        int ans = count*(count-1)/2;
        return ans;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 String s = in.next();
         System.out.println(getCount(s,n));
	 }
	 }
}
