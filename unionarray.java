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
public class unionarray {
    public static void union(int a[],int b[]){
        HashSet<Integer> hash = new HashSet<>();
        int i=0,j=0;
        while(i<a.length||j<b.length){
            while(i<a.length && j<b.length){
                if(a[i]<=b[j] )
                {
                    if(hash.contains(a[i])==false)
                         hash.add(a[i]);
                    i++;
                }
                else if(a[i]>b[j] )
                {
                    if(hash.contains(b[j])==false)
                        hash.add(b[j]);
                    j++;
                }
                
                    
            }
                 while(i<a.length)
                 {
                     if(hash.contains(a[i])==false)
                         hash.add(a[i]);
                     i++;
                 }
                 while(j<b.length)
                 {
                     if(hash.contains(b[j])==false)
                        hash.add(b[j]);
                    j++;
                 }
            
            
        }
        Iterator<Integer> it = hash.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
        
    }
    public static void intersection(int a[],int b[],int n,int m){
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        for(int i=0;i<n1;i++)
            a1[i]=in.nextInt();
        for(int i=0;i<n2;i++)
            a2[i]=in.nextInt();
        union(a1,a2);
    }
}
