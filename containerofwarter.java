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
public class containerofwarter {
    public static int maxArea(int[] height)
    {
        int l=0,r=height.length-1,maxarea=0;
        while(l<r)
        {
            maxarea = Math.max(maxarea,Math.min(height[l], height[r])*(r-1));
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxarea;
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int[] h = new int[n];
            for(int i=0;i<n;i++)
                h[i]=in.nextInt();
            System.out.println(maxArea(h));
        }
    }
}
