/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class RegularExpressionMatching {
    public static boolean isMatch(String s,String p)
    {
        return s.matches(p);
    }
 public static void main(String[] args)
 {
     Scanner in = new Scanner(System.in);
     
     String string = in.nextLine();
     String partern = in.nextLine();
     System.out.print(isMatch(string,partern));
 }
}
