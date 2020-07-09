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
public class Triplets {
    public static void triples(int a[]){
        for(int i=0;i<a.length-1;i++){
        HashSet<Integer> s = new HashSet<Integer>();
        for(int j=i+1;j<a.length;j++)
        {
            int x =-(a[i]+a[j]);
                    if(s.contains(x))
                    {
                        System.out.println(" "+x+" "+a[i]+" "+a[j]);
                    }
                    else
                    {
                        s.add(a[j]);
                    }
        }
        
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        triples(a);
    }
}
