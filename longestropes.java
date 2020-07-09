/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.PriorityQueue;
import java.util.Scanner;
import static javacourse.kmostoccuringelements.kMostOccuring;

/**
 *
 * @author oyo
 */
public class longestropes {
    public static void longropes(int a[],int n){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int res=0,sum=0;
        for(int i=0;i<n;i++)
            heap.add(a[i]);
        while(heap.size()>1)
        {
            sum+=heap.peek();
            heap.poll();
            sum+=heap.peek();
            heap.poll();
            res+=sum;
            heap.add(sum);
            sum=0;
        }
        System.out.print(res);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
        longropes(a,n);
    }
    
}
