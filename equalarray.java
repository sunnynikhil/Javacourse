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
import java.util.Map.Entry;
public class equalarray {
    public static boolean equalornot(int a[],int b[],int n){
        Hashtable<Integer,Integer> hash1 = new Hashtable<>();
        Hashtable<Integer,Integer> hash2 = new Hashtable<>();
        for(int i=0;i<n;i++)
        {
            if(hash1.containsKey(a[i]))
                hash1.put(a[i],hash1.get(a[i])+1);
            else
                hash1.put(a[i], 1);
            
        }
        
        for(int i=0;i<n;i++)
        {
            if(hash2.containsKey(b[i]))
                hash2.put(b[i],hash2.get(b[i])+1);
            else
                hash2.put(b[i], 1);
            
        }
        
        return hash1.equals(hash2);
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n;i++)
            b[i]=in.nextInt();
        boolean res = equalornot(a,b,n);
        if(res)
            System.out.print("YES");
        else
            System.out.print("NO");
        
    }
}
