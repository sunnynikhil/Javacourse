/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.subarraysum.subarraysum;

/**
 *
 * @author oyo
 */
public class trappingofwater {
    public static int countwater(int a[],int n)
    {
        int left_max=0,right=0,l=0,h=n-1,water=0;
                while(l<=h)
                {
                    if(a[l]<a[h])
                    {
                        if(a[l]>left_max)
                            left_max=a[l];
                        else
                            water+=left_max-a[l];
                        l++;
                    }
                    else
                    {
                        if(a[h]>right)
                            right=a[h];
                        else
                            water+=right-a[h];
                        h--;
                    }
                }
                return water;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        
        System.out.print(countwater(arr,n));
        
    }
}
