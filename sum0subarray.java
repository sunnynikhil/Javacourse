/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Scanner;
import static javacourse.maxdistance.maxdist;

/**
 *
 * @author oyo
 */

public class sum0subarray {
    public static int maxlen(int a[],int n){
        int maxlen =0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(a[i]==0 && maxlen==0)
                maxlen=1;
            if(sum==0)
                maxlen=i+1;
            Integer prev = map.get(sum);
            if(prev!=null)
                maxlen=Math.max(maxlen, i-prev);
            else
                map.put(sum, i);
        }
        return maxlen;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        
        System.out.print(maxlen(a,n));
    }
}
