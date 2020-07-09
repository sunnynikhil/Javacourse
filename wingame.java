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

public class wingame {
    
    public static boolean play(int[] arr , int n, int l){
        int i=0;
        while(i<=n){
            if(i+l<=n)
                if(i+l==n)
                    return true;
                
            if(i+1<=n)
            { 
                if(arr[i+1]==0)
                    i++;  
                else 
                    return false;
            }
            if(i==n)
                return true;
            
        }
       
        return false;
    } 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int l=in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            if(play(arr,n,l))
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
    
    
}
