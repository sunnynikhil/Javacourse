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
public class resverseastring {
    public static void reverse(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            stack.push(c);
        }
        s="";
        for(int i=0;i<s.length();i++)
        {
            char c=stack.pop();
            s+=c;
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        reverse(s);
        System.out.print(s);
    }
}
