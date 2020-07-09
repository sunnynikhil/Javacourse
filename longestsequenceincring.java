/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.miniumnumofcoins.minimumcoins;

/**
 *
 * @author oyo
 */
public class longestsequenceincring {
    public static int lenghtofsubsequence(int a[],int n)
    {
        int max=Integer.MIN_VALUE;
//        int curmax=0;
        int[] list = new int[n];
        for(int i=0;i<n;i++)
            list[i]=1;
        for(int i=1;i<n;i++)
            for(int j=0;j<i;j++)
                if((a[i]>a[j]) && list[i]<list[j]+1)
                    list[i]=list[j]+1;
        for(int i=0;i<n;i++)
            if(max<list[i])
                max=list[i];
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(lenghtofsubsequence(a,n));
    }
}
