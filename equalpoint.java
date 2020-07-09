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
public class equalpoint {
    public static int equalpoint(int a[],int n){
        int sum=0,lsum=0,rsum=0;
        for(int i=0;i<n;i++)
            sum=sum+a[i];
        for(int i=0;i<n;i++)
         {
             sum-=a[i];
             if(lsum==sum)
               return i;
             lsum+=a[i];  
         }
        return -1;
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.print(equalpoint(arr,n));
        
    }
}
