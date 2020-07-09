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
public class sumquery11 {
    public static int getSum(int a[],int I,int R,int n)
    {
        int sum=0;
        for(int i=I-1;i<R;i++)
            sum+=a[i];
        return sum;
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
                int q = in.nextInt();
                while(q-->0)
                {
                    int I=in.nextInt();
                    int R=in.nextInt();
                    System.out.print(getSum(a,I,R,n)+" ");
                }
                System.out.println();

            }
	 }
}
