/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.rotatearray.rotateK;

/**
 *
 * @author oyo
 */
public class rotatearrayusingreverselogic {
    public static void getReverse(int a[],int start,int end)
    {
        while(start<end)
        {
            int temp = a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void getKRotate(int a[],int k,int n)
    {
        getReverse(a,0,k-1);
        getReverse(a,k,n);
        getReverse(a,0,n);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int k = in.nextInt();
        getKRotate(arr,k,n-1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        }
        
    }
}
