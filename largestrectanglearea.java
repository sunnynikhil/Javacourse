/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author oyo
 */
public class largestrectanglearea {
    public static int largestrectangle(int a[])
    {
        int n = a.length;
        Stack<Integer> s = new Stack<>();
        int i=0,top=0,area=0,max=0;
        while(i<n)
        {
            
            if(s.empty()|| a[s.peek()]<=a[i])
                s.push(i++);
            else
            {
                top = s.peek();
                s.pop();
                area = a[top]*i;
                if(!s.empty())
                    area = a[top]*(i-s.peek()-1);
                max=Math.max(max, area);
            }
            
        }
        while(!s.empty())
        {
                top = s.peek();
                s.pop();
                area = a[top]*i;
                if(!s.empty())
                    area = a[top]*(i-s.peek()-1);
                max=Math.max(max, area);
            
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(largestrectangle(a));
    }
}
