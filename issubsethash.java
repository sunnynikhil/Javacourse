/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.HashSet;
import static javacourse.subsetArraysort.isSubset;

/**
 *
 * @author oyo
 */
public class issubsethash {
    public static boolean isSubset(int a1[],int a2[],int n,int m){
        HashSet<Integer> ht = new HashSet<>();
        
        for(int i=0;i<m;i++){
            if(!ht.contains(a2[i]))
                ht.add(a2[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            if(!ht.contains(a1[i]))
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
