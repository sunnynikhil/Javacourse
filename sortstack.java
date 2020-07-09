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
public class sortstack {
    
    public static Stack<Integer> sort(Stack<Integer> s){
        Stack<Integer> r = new Stack<>();
        while(!s.isEmpty()){
            int count=0;
            if(r.isEmpty()||r.peek()<s.peek()){
                r.push(s.pop());
            }
            else{
                int temp = s.pop();
                while(r.isEmpty()==false && temp<r.peek())
                {
                    s.push(r.pop());
                    count++;
                }
                r.push(temp);
                if(count>0)
                {
                    r.push(s.pop());
                    count--;
                }
                
            }
        }
        return r;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> input = new Stack<>();
        Stack<Integer> result = new Stack<>();
        for(int i=0;i<n;i++)
            input.push(in.nextInt());
        
        result=sort(input);
        System.out.print(result);
    }
    
}
