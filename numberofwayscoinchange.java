/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.maxsumwithoutajcentelements.maxsum;

/**
 *
 * @author oyo
 */
public class numberofwayscoinchange {
    public static int noofways(int a[],int n,int m)
    {
        int[] ways=new int[m+1];
        ways[0]=1;
        for(int i=0;i<n;i++)
            for(int j=a[i];j<=m;j++)
                ways[j]+=ways[j-a[i]];
        return ways[m];
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(noofways(a,n,m));
    }
}
