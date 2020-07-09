/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.containerofwarter.maxArea;

/**
 *
 * @author oyo
 */
public class insertposition {
    public static int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0;
        
        while(l<=r)
        {
            mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) r = mid-1;
            else l = mid+1;
        }
        return l;
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
            int key =in.nextInt();
            System.out.println(searchInsert(h,key));
        }
    }
}
