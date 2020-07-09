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

public class nextlargest {
    public static void nextlargest(long a[],int n){
        Stack<Long> stack = new Stack<>();
        long r[] = new long[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.empty()&&a[i]>=stack.peek())
            {
               
                stack.pop();
            }
            
              if(stack.empty())
                  r[i]=-1;
              else
                  r[i]=stack.peek();
              stack.push(a[i]);
              
        }
        for(int i=0;i<n;i++)
            System.out.print(r[i]+" ");
        return;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        nextlargest(a,n);
    }
    
}
