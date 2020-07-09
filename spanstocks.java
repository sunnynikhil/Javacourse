/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author oyo
 */
public class spanstocks {
    public static void calculatespan(int p[],int n,int s[]){
        Stack<Integer> stack = new Stack<>();
        s[0]=1;
        stack.push(0);
        for(int i=1;i<n;i++)
        {
            if(!stack.empty() && p[stack.peek()]<=p[i])
                stack.pop();
            s[i]=(stack.empty())?(i+1):(i-stack.peek());
            stack.push(i);
            
        }
        
    }
    static void printArray(int arr[]) 
    { 
        System.out.print(Arrays.toString(arr)); 
    } 
    public static void main(String[] args) 
    { 
        int price[] = { 10, 4, 5, 90, 120, 80 }; 
        int n = price.length; 
        int S[] = new int[n]; 
  
        // Fill the span values in array S[] 
        calculatespan(price, n, S); 
  
        // print the calculated span values 
        printArray(S); 
    } 
}
