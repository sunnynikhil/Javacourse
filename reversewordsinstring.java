/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.reminder7.reminder7;

/**
 *
 * @author oyo
 */
public class reversewordsinstring {
    public static void reversewords(String input){
        String s[] = input.split("\\.");        
        String ans="";
        for(int i=s.length-1;i>=0;i--)
        {ans+=s[i]+".";
        }
        System.out.print(ans.substring(0,ans.length()-1));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        reversewords(s);
    }
}
