/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.Kadanesalgo.maxofsubarray;

/**
 *
 * @author oyo
 */
public class mergetwosortedarrays {
    public static void mergearrays(int a[],int b[],int n,int m)
    {
        for(int j=m-1;j>=0;j--)
        {
            int i,last=a[n-1];
            for(i=n-2;i>=0 && a[i]>b[j];i--)
            {
             a[i+1]=a[i];   
            }
            if(i!=n-2 || last>b[j])
            {
                a[i+1]=b[j];
                b[j]=last;
            }
            
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<m;i++)
            b[i]=in.nextInt();
       mergearrays(a,b,n,m);
       
       for(int i=0;i<n;i++)
            System.out.print(a[i]);
       System.out.println();
        for(int i=0;i<m;i++)
            System.out.print(b[i]);
           
    }
}
