/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.subarraygivensum.getsum;

/**
 *
 * @author oyo
 */
public class sort012 {
    public static void sortArray(int a[])
    {
        int start=0,mid=0,end=a.length-1;
        while(mid<end)
        {
            if(a[mid]==0)
            {
                int temp = a[start];
                a[start]=a[mid];
                a[mid]=temp;
                start++;
                mid++;
            }
            else if(a[mid]==1)
                mid++;
            else
            {
                int temp = a[end];
                a[end]=a[mid];
                a[mid]=temp;
                end--;
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
        sortArray(a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
}
