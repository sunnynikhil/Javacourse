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
public class areaofhistogram {
    public static long areaOfHistogram(long a[],long n)
    {
        long area=0,maxarea=-1;
        Stack<Long> s = new Stack<>();
        long i=0,top=0;
        while(i<n)
        {
            if(!s.empty()) 
                 top=s.peek();
            if(s.empty() || a[(int)top]<=a[(int)i])
                s.push(i++);
            else
            {
                top = s.pop();
                area = a[(int)top]*i;
                if(!s.empty())
                    area = a[(int)top]*(i-s.peek()-1);
                maxarea= Math.max(area, maxarea);
            }
        }
        while(!s.empty())
        {
                top = s.pop();
                area = a[(int)top]*i;
                if(!s.empty())
                    area = a[(int)top]*(i-s.peek()-1);
                maxarea= Math.max(area, maxarea);
        }
        return maxarea;
    }
 public static void main (String[] args)
	 {
	 //code
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
               while(t-->0)
               {
                  int n = in.nextInt();
                  long[] a = new long[n];
                  for(int i=0;i<n;i++)
                      a[i]=in.nextLong();
                  System.out.println(areaOfHistogram(a,n));

               }
	 }   
}
