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
public class nextsmaller {
    
    public static void nextsmaller(int a[]){
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        stack.push(a[0]);
        
        for(int i=1;i<a.length;i++){
            
            if(stack.empty()){
                stack.push(a[i]);
                continue;
            }
            
            while(stack.empty() == false && stack.peek()>a[i]){
                map.put(stack.peek(),a[i] );
                stack.pop();
            }
            stack.push(a[i]);
        }
        
        while(stack.empty()==false){
            map.put(stack.peek(), -1);
            stack.pop();
        }
        for(int i=0;i<a.length;i++)
            System.out.print(map.get(a[i]));
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            
        }
        nextsmaller(a);
    }
}
