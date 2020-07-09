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
public class maxsumnoadj {
    static int dp[] = new int[100];
    static boolean v[] = new boolean[100];
    
    public static int maxsum(int a[],int i,int n){
        
        if(i>=n)
            return 0;
        if(v[i])
            return dp[i];
        v[i]=true;
        dp[i]=Math.max(maxsum(a,i+1,n), a[i]+maxsum(a,i+2,n));
        
        return dp[i];
            
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(maxsum(a,0,n));
    }
}
