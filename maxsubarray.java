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

public class maxsubarray {
    
    public static void max(int a[],int k){
        
         Deque<Integer> s = new java.util.LinkedList<>();
         int i=0;
         for(i=0;i<k;i++)
         {
             if(!s.isEmpty() && a[i]>=s.peekLast())
                 s.removeLast();
             s.addFirst(a[i]);
         }
         for(;i<a.length;i++)
         {
             System.out.println(s.peekLast());
//             if(!s.isEmpty() && s.peekFirst()<= i-k)
//                 s.removeFirst();
             System.out.println("delete:"+s.peekLast());
             if(!s.isEmpty() && a[i]>=s.peekLast())
                 s.removeLast();
             s.addLast(a[i]);
         }
         
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int k = in.nextInt();
        max(a,k);
        
    }
}
