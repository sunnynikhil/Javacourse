/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class zerosumsubarray {
    public static Long countZeroSum(long[] a,long n)
    {
     long count=0,s=0;
     HashMap<Long,Long> map = new HashMap<>();
     for(long i=0;i<n;i++)
     {
         s=s+a[(int)i];
         if(s==0)
             count++;
         if(map.containsKey(s))
         {
             count=count+map.get(s);
             map.put(s, map.get(s)+1);
         }
         else
         {
             map.put(s, (long)1);
         }
     }
     return count;
    }    
    public static void main (String[] args)
	 {
	 //code
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t-->0)
            {
                long n = in.nextLong();
                long[] a = new long[(int)n];
                for(long i=0;i<n;i++)
                    a[(int)i]=in.nextInt();
                System.out.println(countZeroSum(a,n));

            }
	 }
}
