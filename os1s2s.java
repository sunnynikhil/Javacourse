/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.mininswaps.miniswaps;

/**
 *
 * @author oyo
 */
public class os1s2s {
    public static void sort(int a[]){
        int count0=0,count1=0,count2=0;
        for(int i=0;i<a.length;i++)
        {
            switch(a[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
            
        }
        int i=0;
        
        while(count0-->0)
            a[i++]=0;
        while(count1-->0)
           a[i++]=1;
        while(count2-->0)
            a[i++]=2;
        for(int j=0;j<a.length;j++)
            System.out.print(a[j]+" ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        sort(a);
    }
}
