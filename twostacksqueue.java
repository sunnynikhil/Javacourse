/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
import java.util.Stack;
import java.util.LinkedList;
public class twostacksqueue {
    
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public static void maxofsubarray(int a[],int k){
        Deque<Integer> queue = new LinkedList<Integer>();
        int i=0;
        for(;i<k;i++)
        {
            while(!queue.isEmpty()&&a[i]>=a[queue.peekLast()])
                queue.removeLast();
            queue.addLast(i);
        }
        for(;i<a.length;i++){
            System.out.print(a[queue.peek()]+" ");
            while(!queue.isEmpty() && queue.peek() <=i-k)
                queue.removeFirst();
            while(!queue.isEmpty()&&a[i]>=a[queue.peekLast()])
                queue.removeLast();
            queue.addLast(i);
        }
        System.out.print(a[queue.peek()]);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int k = in.nextInt();
        maxofsubarray(a,k);
    }
    
}
