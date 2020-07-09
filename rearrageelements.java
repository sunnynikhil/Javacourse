/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.FindImmediateSmallerThanX.immediateSmaller;

/**
 *
 * @author oyo
 */
public class rearrageelements {
    public static void rearrange(long arr[],int n)
    {
        for(int i=0;i<n;i++)
          arr[i] +=((arr[(int)arr[i]]%n)*n);
        for(int i=0;i<n;i++)
         arr[i]=arr[i]/n;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int x = in.nextInt();
        rearrange(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
    }
}
