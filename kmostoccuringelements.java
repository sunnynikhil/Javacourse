/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import static javacourse.minplatforms.minimumplotformmap;

/**
 *
 * @author oyo
 */
public class kmostoccuringelements {
    public static void kMostOccuring(int arr[], int n, int k){
        // your code here
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hash.containsKey(arr[i]))
               hash.put(arr[i],hash.get(arr[i])+1);
            else
               hash.put(arr[i],1);
        }
        int sum=0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Integer,Integer> entry : hash.entrySet())
        {
            heap.add(entry.getValue());
        }
        for(int i=0;i<k;i++)
        {
            sum=sum+heap.peek();
            heap.poll();
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        int k = in.nextInt();
        kMostOccuring(a,n,k);
    }
}
