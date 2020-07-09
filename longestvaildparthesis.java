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
public class longestvaildparthesis {
    
    public static int longestValidParentheses(String s)
    {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                stack.push(i);
            else
            {  if(!stack.empty())
                  stack.pop();
                if(stack.empty())
                    stack.push(i);
                else
                    max=Math.max(max, i-stack.peek());
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(longestValidParentheses(s));
    }
}
