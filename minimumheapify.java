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
public class minimumheapify {
    public static void heapify(int a[],int n,int pos){
        int i =pos;
        int l = 2*pos+1;
        int r = 2*pos+2;
        if(l>=0 &&l<n &&a[l]!=0 && a[l]<a[pos])
            pos=l;
        if(r<n && r>=0&&a[r]!=0 && a[r]<a[pos])
            pos=r;
        if(i!=pos)
        {
            int temp = a[i];
            a[i]=a[pos];
            a[pos]=temp;
            heapify(a,n,pos);
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=(n/2)-1;i>=0;i--)
            heapify(a,n,i);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
