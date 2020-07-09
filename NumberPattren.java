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
public class NumberPattren {
    public static String getMinNumberPattern(String s)
    {
        int n = s.length();
        if(n>=9)
            return "-1";
        char res[] = new char[n+1];
        int count =1;
        for(int i=0;i<=n;i++)
        {
            
            if(i==n || s.charAt(i)=='I')
            {
                for(int j=i-1;j>=-1;j--)
                {
                    res[j+1]=(char)((int)'0' + count++);
                    if(j>=0 && s.charAt(j)=='I')
                        break;
                }
            }
        }
        return new String(res);
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String n = in.next();
         System.out.println(getMinNumberPattern(n));
	 
	 }
	 }
}
