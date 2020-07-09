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
public class longestsubsequent {
    public static int longestsub(int a[]){
        int co=0;
        int l=0;
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
                co++;
            while(co>1){
                if(a[l]==0)
                {
                    co--;
                    
                }
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print("maxlen="+longestsub(a));
        }
    }
    
}
