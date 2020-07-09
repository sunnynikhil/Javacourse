/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.longestsubsequeue.longestsub;

/**
 *
 * @author oyo
 */
public class twosum {
    public static boolean twosum(int a[],int n,int x){
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==x)
                    return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int x = in.nextInt();
        System.out.print(twosum(a,n,x));
    }
}
