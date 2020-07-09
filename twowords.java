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
public class twowords {
    public static boolean comp(String s1 ,String s2){
        int i=0,j=0;
        Stack<Character> one = new Stack<>();
        Stack<Character> two = new Stack<>();
        while(i<s1.length()){
            char c = s1.charAt(i);
            if(c!='#')
                one.push(c);
            else
                one.pop();
            i++;
        }
        while(j<s2.length()){
            char c = s2.charAt(j);
            if(c!='#')
                two.push(c);
            else
                two.pop();
            j++;
        }
        System.out.print(one);
        System.out.print(two);
        while(one.empty()==false && two.empty()==false)
        {
            if(one.peek()==two.peek())
            {
                one.pop();
                two.pop();
            }
            else
                return false;
        }
        if(one.empty()==false || two.empty()==false)
            return false;
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        boolean check = comp(s1,s2);
        System.out.print(check);
    }
}
