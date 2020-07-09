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
public class max1s {
    
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int m = in.nextInt();
	 int a[][] = new int[n][m];
	 int count=0;
	 int max=0;
         int row=0,res=0;
	 for(int i=1;i<=n*m;i++)
	 {
             int val = in.nextInt();
             if(val==1)
                 count++;
             int col = i%m;
             if(col==0)
             {
                 if(count>max)
                 {
                 max=count;
                 res=row;
                 }
                 count=0;
                 row++;
             }
	     
	 }
	 System.out.println(res);
	 }
	 }
}
