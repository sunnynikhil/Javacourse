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
public class countx {
     public static int getXs(int x,int n,int m)
     {
         int result=0;
         int itr = n+1;
         while(itr<m)
         {
            if (itr % 10 == x) 
                    result++; 
            if (itr != 0 && itr/10 == x) 
                { 
                    result++; 
                    itr++; 
                } 
            else if (itr/10 == x-1) 
                    itr = itr + (10 - x); 
            else
                    itr = itr + 10; 
         }
         return result;
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int x = in.nextInt();
	 int y = in.nextInt();
	 System.out.println(getXs(n,x,y));
	 }
	 }
    
}
