/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class longestincrsing {
    public static int findLongestConseqSubseq(int a[],int n)
    {
        int count=0,max=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
            if(!set.contains(a[i]))
                set.add(a[i]);
        for(int i=0; i<n; i++)
		{
			if(!set.contains(a[i]-1))
			{
				int j = a[i];
				while(set.contains(j))
				{
					j++;
				}
				if(max < j-a[i])
					max = j-a[i];
			}
		}
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(findLongestConseqSubseq(a,n));
    }
}
