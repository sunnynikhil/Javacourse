/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class longestsuubstring {
    public static int getLongestsubstring(String s)
    {
        int count=0,max=0,i=0;
        int [] lastIndex = new int[256]; 
        Arrays.fill(lastIndex, -1); 
        for(int j=0;j<s.length();j++)
        {
            i=Math.max(i, lastIndex[s.charAt(j)]+1);
            max= Math.max(max, j-i+1);
            lastIndex[s.charAt(j)]=j;
            
        }
       return max; 
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0)
        {
            String s = in.next();
            System.out.println(getLongestsubstring(s));
        }
    }
}
