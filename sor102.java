/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.quicksortarray.quicksort;

/**
 *
 * @author oyo
 */
public class sor102 {
 
    public static void sort012(int a[], int n){
    int low = 0, high = n-1, mid = 0;
    while(mid <= high){
        if(a[mid]==0) {
            int temp=a[low];
            a[low]=a[mid];
            a[mid]=temp;
            low++;
            mid++;
        } else if(a[mid]==1) {
            mid++;
        } else {
            int temp=a[mid];
            a[mid]=a[high];
            a[high]=temp;
            high--;
        }
    }
}

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        sort012(a,n);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
