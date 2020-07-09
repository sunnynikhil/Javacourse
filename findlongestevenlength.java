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
public class findlongestevenlength {
    public static int findLongestLength(String s)
    {
        int ans=0,n=s.length();
        for(int i=0;i<n-1;i++)
        {
            int l=i,r=i+1;
            int lsum=0,rsum=0;
            while(r<n && l>=0)
            {
                lsum+=s.charAt(l)-'0';
                rsum+=s.charAt(r)-'0';
                if(lsum==rsum)
                {
                    ans = Math.max(ans, r-l+1);
                }
                l--;
                r++;
            }
        }
        return ans;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String n = in.next();
	 System.out.println(findLongestLength(n));
	 }
	 }
}
