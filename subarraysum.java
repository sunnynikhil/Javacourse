/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Scanner;
import static javacourse.leadersofarray.printleader;

/**
 *
 * @author oyo
 */
public class subarraysum {
    public static void subarraysum(int a[],int n,int sum)
    {
        int cur_sum=0;
        int start=0,end=-1;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            cur_sum+=a[i];
            if(cur_sum-sum==0)
            {
                start=0;
                end=i;
                break;
            }
            if(hash.containsKey(cur_sum-sum))
            {
                start=hash.get(cur_sum-sum)+1;
                end=i;
                break;
            }
            hash.put(cur_sum, i);
        }
        if(end==-1)
            System.out.print(end);
        else
            System.out.print(start+1+" "+(end+1));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int sum = in.nextInt();
        subarraysum(arr,n,sum);
        
    }
}
