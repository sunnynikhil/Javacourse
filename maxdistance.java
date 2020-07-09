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
import java.util.Hashtable;
public class maxdistance {
    public static int maxdist(int a[],int n){
        int resmax=0,max=0;
        Hashtable<Integer,Integer> hash =  new Hashtable<>();
        for(int i=0;i<n;i++)
        {
            if(hash.containsKey(a[i]))
            {
                max=i-hash.get(a[i]);
                
            }
            else
                hash.put(a[i], i);
            if(max>resmax)
                resmax=max;
        }
        
        return resmax;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        
        System.out.print(maxdist(a,n));
    }
}
