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
public class infixtopotfix {
    public static int precd(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':    
                return 2;
            case '^':
                return 3;
                
        }
        return 0;
    }
    public static String infixtopostfix(String s){
        String r ="";
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                r+=ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')')
            {
                while(!stack.empty()&&stack.peek()!='(')
                    r+=stack.pop();
                if(!stack.empty()&&stack.peek()!='(')
                    return "Invaild expersion";
                else
                    stack.pop();
            }
            else
            {
                while(!stack.empty()&&precd(ch)<=precd(stack.peek()))
                {
                    if(stack.peek()=='(')
                        return "Invaild expersion";
                    r+=stack.pop();
                }
                stack.push(ch);
            }
            i++;
        }
        while(!stack.empty())
            r+=stack.pop();
        return r;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(infixtopostfix(s));
    }
}
