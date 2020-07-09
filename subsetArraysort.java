/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.Arrays;
import java.util.*;
/**
 *
 * @author oyo
 */
public class subsetArraysort {
    
    public static boolean isSubset(int arr1[],int arr2[],int n,int m){
        int i=0;
        int j=0;
        
        while(i<n && j<m){
            if(arr1[i]>arr2[j])
                j++;
            else if(arr1[i]==arr2[j])
            {
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
                return false;
        }
        if(i<n){
            return false;
        }
        
        return true;
    }
    public static void main(String[] args){
        int arr1[] = {1,6,7};
        int arr2[] = {6,8,5,6,1};
        int n=arr1.length;
        int m= arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isSubset=isSubset(arr1,arr2,n,m);
        if(isSubset)
            System.out.print("two arrays are subset to eachother");
        else
            System.out.print("two arrays are not subset to eachother");
    }
}
