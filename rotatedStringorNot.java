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
public class rotatedStringorNot {
    public static String reverse(String s1,int l,int h)
    {
        char s[] = s1.toCharArray();
        while(l<h)
        {
            char ch = s[l];
            s[l] =s[h];
            s[h]=ch;
            l++;
            h--;
        }
        return new String(s);
    }
    public static boolean rotatedString(String s1,String s2)
    {
        String p=reverse(s1,0,2-1);
        p=reverse(p,2,p.length()-1);
        p=reverse(p,  0,p.length()-1);
        String q=reverse(s2,0,2-1);
        q=reverse(q,2,q.length()-1);
        q=reverse(q, 0,q.length()-1);
        return p.equals(s2) || s1.equals(q) ;
        
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String s1 = in.next();
         String s2 = in.next();
         if(rotatedString(s1,s2))
             System.out.println("1");
         else
             System.out.println("0");
	 
	 }
	 }
}
