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
import java.util.LinkedList;
public class minandmaxofksubarrays {
    public static void min_max(int a[],int k){
        
        Deque<Integer> s = new LinkedList<>(), g = new LinkedList<>();
        int i=0;
        for(i=0;i<k;i++){
            while(!s.isEmpty() && a[i]<=s.peekLast())
                s.removeLast();
            while(!g.isEmpty()&& a[i]>=s.peekLast())
                g.removeLast();
            
            s.addLast(i);
            g.addLast(i);
                        
        }
        for(;i<a.length;i++){
            System.out.println(a[s.peekFirst()]+","+a[g.peekFirst()]);
            
            while(!s.isEmpty() && s.peekFirst()<= i-k)
                s.removeFirst();
            while(!g.isEmpty() && g.peekFirst()<= i-k)
                g.removeFirst();
            while(!s.isEmpty() && a[i]<=s.peekLast())
                s.removeLast();
            while(!g.isEmpty()&& a[i]>=s.peekLast())
                g.removeLast();
            
            s.addLast(i);
            g.addLast(i);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
          a[i]=in.nextInt();
    }
        int k = in.nextInt();
        min_max(a,k);
}
}
