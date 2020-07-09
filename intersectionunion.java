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
import java.util.HashSet;
public class intersectionunion {
    public static void intersection1(int a1[],int a2[]){
        int n1 = a1.length;
        int n2 = a2.length;
        int u[] = new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++)
        {
            u[k++]=a1[i];
            
        }
        HashSet<Integer> s = new HashSet<>();
        for(int j=0;j<n1;j++)
            s.add(a1[j]);
        
        for(int i=0;i<n2;i++)
        {
            if(!s.contains(a2[i]))
                u[k++]=a2[i];
        }
        
        
        for(int i=0;i<k;i++)
            System.out.print(u[i]+" ");
    }
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int a1[] = new int[n1];
        for(int i=0;i<n1;i++)
            a1[i]=in.nextInt();
        int n2 = in.nextInt();
        int a2[] = new int[n2];
        for(int i=0;i<n2;i++)
            a2[i]=in.nextInt();
        intersection1(a1,a2);
    }
}
