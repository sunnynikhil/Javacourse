/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author oyo
 */
public class ShortenTheURL {
    public static String getShortURL(int n)
    {
        String res = "";
        String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        while(n>0)
        {
            
            int r = n%62;
            res+=(map.charAt(r));
            n=n/62;
            
        }
        return reverse(res);
    }
    public static String reverse(String s)
    {
       String res = "";
       for(int i=s.length()-1;i>=0;i--)
           res+=s.charAt(i);
//       res+='\0';
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
	 System.out.println(getShortURL(n));
	 }
	 }
}
