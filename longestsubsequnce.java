/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;
import static javacourse.ipaddress.isVaild;

/**
 *
 * @author oyo
 */
public class longestsubsequnce {
    public static int longestsubsequnce(String s){
        int n= s.length();
        int res =0;
        int i=0,j=0;
        int lastIndex[] = new int[256];
        Arrays.fill(lastIndex, -1);
        for(j=0;j<n;j++)
        {
            i = Math.max(i, lastIndex[s.charAt(j)]+1);
            res=Math.max(res, j-i+1);
            lastIndex[s.charAt(j)]=j;
        }
        return res;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(longestsubsequnce(s));
    }
}
