/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class MinimumEnergy {
    
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int psum=0,nsum=0,min=1;
	 int[] a = new int[n];
         boolean flag=false;
	 for(int i=0;i<n;i++)
         {
             a[i]=in.nextInt();
             if(a[i]<0)
                 flag=true;
         }
         if(flag==false)
         {
             System.out.println("1");
         }
         else
         {
         int negative_index=0;
         for(int i=a.length-1;i>=0;i--)
         {
             if(a[i]<0)
             {
                 negative_index=i;
                 break;
             }
         }
	 for(int i=0;i<=negative_index;i++)
	   {
	       if(a[i]<0)
	         nsum=a[i];
	       else  
	         psum+=a[i];
	   }
	 if(Math.abs(nsum)>psum)
	   System.out.println(Math.abs(nsum+psum)+1);
	 else
	   System.out.println("1");
	 }
         }
	 }
}
