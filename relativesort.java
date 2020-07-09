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
import java.util.Arrays;
import java.util.*;
import java.util.HashMap;
public class relativesort {
    
    public static void relativeSort(int a1[],int a2[],int n,int m){
     Map<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<m;i++)
     { map.putIfAbsent(a2[i], 0);  
     }
     for(int i=0;i<n;i++){
         if(map.containsKey(a1[i])==true)
         {
             map.put(a1[i], map.get(a1[i])+1);
         }
     }
     int temp[] = new int[n];
     int k=0;
     for(int i=0;i<n;i++)
         temp[i]=a1[i];
     for(int i=0;i<m;i++){
         int count = map.getOrDefault(a2[i],0);
         while(count>0)
         {
             a1[k] = a2[i];
             k++;
             count--;
         }
     }
     Arrays.sort(temp);
     for(int i=0;i<n;i++){
         if(map.containsKey(temp[i])==false)
         {
             a1[k++]=temp[i];
         }
     }
     
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a1[] = new int[n];
        for(int i=0;i<n;i++)
            a1[i]=in.nextInt();
        int m = in.nextInt();
        int a2[] = new int[m];
        for(int i=0;i<m;i++)
             a2[i]=in.nextInt();
        relativeSort(a1,a2,n,m);
        for(int i=0;i<n;i++)
            System.out.print(a1[i]+" ");
    }
}
