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
import static javacourse.nextlargest.nextlargest;

public class maxofmin {
    public static void maxofmin(int a[],int n){
        
        Stack<Integer> s = new Stack<>();
        int l[] = new int[n+1];
        int r[] = new int[n+1];
        int ans[] = new int[n+1];
        for(int i=0;i<n+1;i++)
            l[i]=-1;
        for(int i=0;i<n+1;i++)
            r[i]=n;
        for(int i=0;i<n;i++)
        {
            while(!s.empty()&&a[s.peek()]>=a[i])
                s.pop();
            if(!s.empty())
                l[i]=s.peek();
            s.push(i);
        }
        while(!s.empty())
            s.pop();
        for(int i=n-1;i>=0;i--)
        {
            while(!s.empty()&&a[s.peek()]>=a[i])
                s.pop();
            if(!s.empty())
                r[i]=s.peek();
            s.push(i);
        }
        for(int i=0;i<=n;i++)
            ans[i]=0;
        
        for(int i=0;i<n;i++)
        {
            int len = r[i]-l[i]-1;
            ans[len]=Math.max(ans[len], a[i]);
        }
        for (int i=n-1; i>=1; i--) 
            ans[i] = Math.max(ans[i], ans[i+1]); 
        System.out.println("result:");
        printarray(ans,n); 
    }
    public static void printarray(int a[],int n){
        for (int i=1; i<=n; i++) 
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        maxofmin(a,n);
    }
}
