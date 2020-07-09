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
public class binaryresper {
    public static void convertToBinary(int n)
    {
        String res = "";
        while(n>1)
        {
            int r = n%2;
            res+=r;
            n=n/2;
        }
        res+=n;
        int length = res.length();
        for(int i=0;i<14-length;i++)
            res+="0";
        res=reverse(res);
        System.out.println(res);
    }
    public static String reverse(String s)
    {
        String res ="";
        for(int i=s.length()-1;i>=0;i--)
            res+=s.charAt(i);
        return res;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 convertToBinary(n);
	 }
	 }
    
}
