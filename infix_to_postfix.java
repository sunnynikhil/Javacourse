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
import java.util.Stack;
public class infix_to_postfix {
    public static int prec(char c){
        switch(c){
            case '+': 
            case '-': 
                return 1; 
            
            case '/':
            case '*':
                return 2; 

            case '^': 
                return 3;       
        }
        return -1;
        
    }
    public static String infixtopostfix(String exp){
        String result = "";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char c =exp.charAt(i);
            if(Character.isLetterOrDigit(c))
                result+=c;
            else if(c == '(')
                s.push(c);
            else if(c==')')
            {
                while(!s.isEmpty()&& s.peek()!='(')
                    result+=s.pop();
                if(!s.isEmpty()&&s.peek()!='(')
                    return "invaild";
                else
                    s.pop();
            }
            else
            {
               while(!s.isEmpty() && prec(c)<=prec(s.peek()))
               {
                   if(s.peek()=='(')
                       return "invaild";
                   result+=s.pop();
               }
               s.push(c);
            }
        }
        while(!s.isEmpty()){
            if(s.peek()=='(')
                return "invaild";
            result+=s.pop();
        }
        return result;
    }
    public static void main(String[] args){
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.print(infixtopostfix(s));
    }
}
