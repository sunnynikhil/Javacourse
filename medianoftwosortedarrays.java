/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.unionarray.union;

/**
 *
 * @author oyo
 */

public class medianoftwosortedarrays {
    
    public static double meadian(int a[],int b[],int n,int m){
        
         if(n>m)
             return meadian(b,a,m,n);
       int min_i=0,max_i=n,meadian=-1,i=0,j=0;
        while(min_i<=max_i){
            i=(min_i+max_i)/2;
            j=((n+m+1)/2)-i;
            if(i<max_i&&j>0&&b[j-1]>a[i])
                min_i=i+1;
            else if(i>min_i&& i>0 && a[i-1]>b[j])
                max_i=i-1;
            else{
                if(i==0)
                    meadian=b[j-1];
                else if(j==0)
                    meadian=a[i-1];
                else
                    meadian=Math.max(a[i-1], b[j-1]);
                break; 
            }
                   
        }
        if((n+m)%2==1)
            return (double)meadian;
        if(i==n)
            return (double)(meadian+b[j])/2.0;
        if(j==m)
            return (double)(meadian+a[i])/2.0;
        
        return (double)(meadian+Math.min(a[i], b[j]))/2.0;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        for(int i=0;i<n1;i++)
            a1[i]=in.nextInt();
        for(int i=0;i<n2;i++)
            a2[i]=in.nextInt();
        System.out.print(meadian(a1,a2,n1,n2));
    }
}
