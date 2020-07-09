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
import java.lang.Character;
import java.util.Stack;


public class JavaStack {
    
    public static boolean vaildate(String input){
        
                        Stack<Character> stack = new Stack<Character>();
                        int n=input.length();
                        int i=0;
                        while(i<n)
                        {
                            System.out.println("stack="+stack+"i="+i);
                            if(input.charAt(i)=='[' || input.charAt(i)=='('||input.charAt(i)=='{' )
                            {
                                System.out.println("input="+input.charAt(i));
                                stack.push(input.charAt(i));
                            }
                            else
                            {
                                if(stack.empty())
                                    return false;
                                if((input.charAt(i)==']' && stack.peek()=='[')||
                                        (input.charAt(i)=='}' && stack.peek()=='{')||
                                        (input.charAt(i)==')' && stack.peek()=='('))
                                    stack.pop();
                                else
                                    return false;
                            }
                            i++;
                        }
                        if(stack.empty())
                         return true;
                        else 
                            return false;
    }
    public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
                        if(vaildate(input))
                            System.out.println("true");
                        else
                            System.out.println("false");
            
		}
		
	}
    
}
