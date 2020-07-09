/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;
import java.util.LinkedList;

/**
 *
 * @author oyo
 */
public class getNegativeValueinWindow {
    public static void getNegativeValues(int a[],int n,int k)
    {
        int min=Integer.MIN_VALUE;
        Vector<Integer> v = new Vector<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            if(a[i]<0)
           {
              queue.add(a[i]);
                
            }
        }
        if(queue.isEmpty()==false)
            v.add(queue.peek());
        else
            v.add(0);
   for(int i=k;i<n;i++)
        {
                if(queue.peek()==a[i-k])
                { 
                    queue.remove();
                }
                if(a[i]<0)
                { 
                queue.add(a[i]);
                }
            if(queue.isEmpty()==false)
                v.add(queue.peek());
            else
                v.add(0);
        }
   for(Integer i : v)
        System.out.print(i+" ");
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int a[] = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         int k = in.nextInt();
         getNegativeValues(a,n,k);
         System.out.println();
         
	 }
	 }
    
}
