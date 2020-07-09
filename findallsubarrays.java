/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Scanner;
import static javacourse.sum0subarray.maxlen;

/**
 *
 * @author oyo
 */
public class findallsubarrays {
    public static int maxcount(int a[],int n){
        int count=0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            
            if(sum==0)
                count++;
            if(map.containsKey(sum))
            { count+=map.get(sum);
               map.put(sum,map.get(sum)+1);
            }
            
            else 
              map.put(sum, 1);
                
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        
        System.out.print(maxcount(a,n));
    }
}
