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
public class exactmax {
    public static int getMax(String s)
    {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                sum=sum*10+(s.charAt(i))-'0';
            }
            else
            {
                if(sum>max)
                {
                    max=sum;
                }
                sum=0;
            }
        }
        return max;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String n = in.next();
	 System.out.println(getMax(n));
	 }
	 }
}
