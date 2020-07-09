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
public class minimumjumps {
    public static int minjumps(int a[]){
        
        int max=a[0];
        int step=a[0];
        int jumps=1;
        if(a.length<=1)
            return 0;
        if(a[0]==0)
            return 0;
        for(int i=1;i<a.length;i++){
            if(i==a.length-1)
                return jumps;
            max=Math.max(max, i+a[i]);
            step--;
            if(step==0)
            {
                jumps++;
                step=max-i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int min = minjumps(arr);
        System.out.print("minimum jumps"+min);
    }
    
    
}
