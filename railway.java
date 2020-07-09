/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;

/**
 *
 * @author oyo
 */
public class railway {
    
    public static int minimumplotforms(int a[],int d[],int n){
        int result=1,pltforms=1,i=1,j=0;
         
        while(i<n&&j<n){
            if(a[i]<=d[j])
            {
                pltforms++;
                i++;
            }
            else if(a[i]>d[j])
            {
                pltforms--;
                j++;
            }
            if(pltforms>result)
                result=pltforms;
        }
        return result;
    }
 public static void main(String[] args){
        
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 }; 
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 }; 
        int n = arr.length; 
        System.out.print("minimum plotform:"+minimumplotforms(arr,dep,n));
 }   
}
