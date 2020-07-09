/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Hashtable;
import java.util.Scanner;
import static javacourse.sum0subarray.maxlen;

/**
 *
 * @author oyo
 */
public class nonrepeatingelements {
    public static void nonrepating(int a[],int n){
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        for(int i=0;i<n;i++)
        {
            if(hash.containsKey(a[i]))
                hash.put(a[i], hash.get(a[i])+1);
            else
                hash.put(a[i], 1);
        }
        for(int i=0;i<n;i++)
        {
            if(hash.get(a[i])==1)
                System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        nonrepating(a,n);
    }
}
