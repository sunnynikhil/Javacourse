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

public class nfibonabaic {
    public static void printfibo(int  n)
    {
        long[] a = new long[n];
        a[0]=1;
        a[1]=1;
        System.out.print(a[0]+" "+a[1]+" ");
        for(int i=0;i<n-2;i++)
        {
            a[i+2]=a[i]+a[i+1];
            System.out.print(a[i+2]+" ");
        }
        
    }
    public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 printfibo(n);}
}
