/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.numberofwayscoinchange.noofways;

/**
 *
 * @author oyo
 */
public class miniumnumofcoins {
    public static int minimumcoins(int a[],int n,int m)
    {
        int[] table = new int[m+1];
        table[0]=0;
        for(int i=1;i<=m;i++)
            table[i]=Integer.MAX_VALUE;
        for(int i=1;i<=m;i++)
            for(int j=0;j<n;j++)
            {
                if(a[j]<=i)
                {
                    int sub_res=table[i-a[j]];
                    if(sub_res!=Integer.MAX_VALUE && sub_res+1<table[i])
                        table[i]=sub_res+1;
                }
                    
            }
        return table[m];
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(minimumcoins(a,n,m));
    }
    
}
