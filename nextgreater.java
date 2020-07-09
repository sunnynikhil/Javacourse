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
public class nextgreater {
    public static void nextgreater(int a[]){
        Stack<Integer> s = new Stack<>();
        s.push(a[0]);
        for(int i=1;i<a.length;i++){
            if(a[i]> s.peek()){
                while(!s.isEmpty())
                {
                 System.out.println(s.peek()+"->"+a[i]);
                 s.pop();
                }
            }
           
            s.push(a[i]);
           
        }
        while(!s.isEmpty())
        {
          System.out.println(s.peek()+"-> -1");
                 s.pop();  
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        nextgreater(a);
    }
}
