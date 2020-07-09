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
public class parathesis {
    public static boolean ispar(String x){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='{' || x.charAt(i)=='['||x.charAt(i)=='(' )
               s.push(x.charAt(i));
            else
            {
                if(s.empty())
                    return false;
                if((x.charAt(i)==']' && s.peek()=='[') || (x.charAt(i)=='}' && s.peek()=='{') || (x.charAt(i)==')' && s.peek()=='('))
                    s.pop();
                else
                    return false;
            }
        }
        if(s.empty()==false)
                    return false;
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(ispar(s));
    }
}
