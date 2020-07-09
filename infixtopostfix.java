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

public class infixtopostfix {
 
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
    public static String infixToPostfix(String s){
        
        String result = "";
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
                result+=c;
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while(!stack.empty() && stack.peek()!='(')
                    result+=stack.pop();
                if(!stack.empty() && stack.peek()!='(')
                  return "Invaild expersion";
                else
                    stack.pop();
            }
            else{
                while(!stack.empty()&& prec(c)<= prec(stack.peek())){
                    if(stack.peek()=='(')
                        return "invaild expression";
                    result += stack.pop();
                }
                stack.push(c);
            }
            
        }
        while(!stack.empty()){
            if(stack.peek()=='(')
                return "invaild expression";
        result+=stack.pop();
        }
        
       return result; 
    }
    public static void main(String[] args){
        String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(infixToPostfix(exp));
    }
}
