/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
public class filpos {
    public static void noofzeros(int a[],int m){
        int wr=0,count=0,wl=0,bestl=0,bestwindow=0;
        while(wr<a.length){
            if(count<=m)
            {
                    if(a[wr]==0)
                    count++;
                    wr++;
            }
            if(count>m){
                if(a[wl]==0)
                    count--;
                     wl++;
            }
            if(((wr-wl)>bestwindow)&&count<=m)
            {
                bestwindow=wr-wl;
                bestl=wl;
            }
        }
        for(int i=0;i<bestwindow;i++)
        {
            if(a[bestl+i]==0)
                System.out.print(bestl+i);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int m = in.nextInt();
        noofzeros(a,m);
    }
}
