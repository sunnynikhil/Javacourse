/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class primenumbersetbits {
    public static int setBits(int n)
    {
        return Integer.bitCount(n);
    }
    public static int log2(int n)
    {
        return (int)(Math.log(n)/Math.log(2)+1e-10);
    }
    public static ArrayList<Integer> sevenOfEratotheses(int n)
    {
        boolean[] prime = new boolean[n+1];
        for(int p=2;p*p<=n;p++)
        {
            if(prime[p]==false)
                for(int i=p*2;i<n+1;i+=p)
                    prime[i]=true;
        }
        ArrayList<Integer> lis = new ArrayList<>();
        for(int p=2;p<=n;p++)
            if(prime[p]==false)
                lis.add(p);
        return lis;
    }
    public static int getPrimenumberSetBits(int n,int m)
    {
        int count=0;
        ArrayList<Integer> primearr = new ArrayList<>();
        primearr = sevenOfEratotheses((int)Math.ceil(log2(m)));
        for(int i=n;i<=m;i++)
        {
            int temp=setBits(i);
            if(primearr.contains(temp))
                count++;
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
	 int n = in.nextInt();
         int m = in.nextInt();
         System.out.println(getPrimenumberSetBits(n,m));
	 
	 }
	 }
}
