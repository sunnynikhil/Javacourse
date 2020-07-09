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
import static javacourse.maxdistance.maxdist;

public class longestsubsequeue {
    public static int longestsub(int a[],int n){
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<n;i++)
            hash.add(a[i]);
       
        int resmax=0,max=0;
        for(int i=0;i<n;i++)
        {
           if(!hash.contains(a[i]-1)){
               int j=a[i];
               while(hash.contains(j))
                   j++;
               if(max<j-a[i])
                   max=j-a[i];
           } 
        }
        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        
        System.out.print(longestsub(a,n));
    }
    
}
