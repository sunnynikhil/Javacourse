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
public class findelementinsortedarray {
    public static int search(int a[],int l,int h,int key){
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(a[mid]==key)
            return mid;
        if(a[l]<=a[mid]){
            if(key>=a[l] && key<=a[mid])
               return  search(a,l,mid-1,key);
            return search(a,mid+1,h,key);
        }
        else{
            if(key<=a[h]&&key>=a[mid])
               return search(a,mid+1,h,key);
          return  search(a,l,mid-1,key);
        }
        
    } 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 1000;
        int a[] = new int[n];
        int j,i;
        for(i=564,j=0;i<=1000&&j<=1000;i++,j++)
            a[j]=i;
        for(i=1;i<=563&&j<=1000;i++,j++)
            a[j]=i;
        int key = 298;
        int index=search(a,0,n-1,key);
        System.out.print(index);
        
    }
}
