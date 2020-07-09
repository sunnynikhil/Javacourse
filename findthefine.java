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
public class findthefine {
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
                int n = in.nextInt();
                int date = in.nextInt();
                int cars[]=new int[n];
                int fine[] = new int[n];
                for(int i=0;i<n;i++)
                    cars[i]=in.nextInt();
                for(int i=0;i<n;i++)
                    fine[i]=in.nextInt();
                boolean flag=true;
                if(date%2!=0)
                    flag=false;
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    if(flag==true)
                    {  
                        if(cars[i]%2!=0)
                            sum+=fine[i];
                    }
                    else
                        {
                          if(cars[i]%2==0)
                            sum+=fine[i];  
                        }
                }
         
             
            System.out.println(sum);
         
         
	 }
	 }
    
}
