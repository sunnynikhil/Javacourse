/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class Equilibrium {
    public static int getEquilibriamPoint(int a[],int n)
    {
        int sum=0,lsum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        for(int i=0;i<n;i++)
        {
            sum-=a[i];
            if(sum==lsum)
                return i;
            lsum+=a[i];
        }
        return -1;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(getEquilibriamPoint(arr, n));
    }
    }
}
