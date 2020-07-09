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
public class JavaSubarray {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum=arr[i];
            if(arr[i]<0)
                count++;
            for(int j=i+1;j<n;j++){
                sum=sum+arr[j];
                if(sum<0)
                    count++;
            }
        }
        System.out.print(count);
        
    }
}
