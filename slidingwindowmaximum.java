/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
import static javacourse.minimumsumsubarray.minSubArrayLen;

/**
 *
 * @author oyo
 */
public class slidingwindowmaximum {
    public static int[] maxSlidingWindow(int a[],int k)
    {
        Deque<Integer> queue = new LinkedList<>();
        int i=0;
        for(i=0;i<k;++i)
        {
            while(!queue.isEmpty() &&a[i]>=a[queue.peekLast()])
                queue.removeLast();
            queue.addLast(i);
        }
        int ans[] = new int[a.length+1],count=0;
        for(;i<a.length;++i)
        {
            ans[count++]=a[queue.peek()];
            while(!queue.isEmpty() && queue.peekFirst()<=i-k)
                queue.removeFirst();
            while(!queue.isEmpty() && a[i]>=queue.peekLast())
                queue.removeLast();
            queue.addLast(i);          
        }
        ans[count++]=a[queue.peek()];
        
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int k = in.nextInt();
        int[] ans =maxSlidingWindow(a,k);
        for(int i=0;i<n-k+1;i++)
            System.out.print(ans[i]+" ");
    }
}
