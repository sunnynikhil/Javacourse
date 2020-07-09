/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author oyo
 */
public class printDiagonally {
    
    public static void printDiagonally(int a[][],int n)
     {
         HashMap<Integer,Vector<Integer>> map = new HashMap<>();
         for(int i=0;i<n;i++)
           for(int j=0;j<n;j++)
             {
                 Vector<Integer> k = map.get(i+j);
                 if(k==null)
                  {
                      k = new Vector<>();
                      k.add(a[i][j]);
                  }
                  else
                  {
                      k.add(a[i][j]);
                      
                  }
                  map.put(i+j,k);
             }
         
         for(Map.Entry<Integer,Vector<Integer>> entry : map.entrySet())
         {
             Vector<Integer> temp = entry.getValue();
             for(Integer i: temp)
             {
                 System.out.print(i+" ");
             }
         }
             
     }
   
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int a[][] = new int[n][n];
	 for(int i=0;i<n;i++)
          for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
	 printDiagonally(a,n);
	 System.out.println();
	 }
	 }
}
