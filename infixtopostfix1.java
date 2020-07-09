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
public class infixtopostfix1 {
     static int prec(char ch){
         switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1;
    }
    public static String convertToPostfix(String s)
    {
        String res = "";
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                res+=s.charAt(i);
                
            }
            else if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                while(!stack.empty() && stack.peek()!='(')
                    res+=stack.pop();
                if(!stack.empty() && stack.peek()!='(')
                    return "Worng";
                else
                    stack.pop();
                
            }
            else
            {
                while(!stack.empty() && prec(s.charAt(i))<=prec(stack.peek()))
                {
                    if(stack.peek()=='(')
                        return "wrong";
                    res+=stack.pop();
                }
                stack.push(s.charAt(i));
            }
            
            i++;    
        }
        while(!stack.empty())
        {
            res+=stack.pop();
        }
        return res;
    }
    	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String s = in.next();
         System.out.println(convertToPostfix(s));
	 
	 }
	 }
}
