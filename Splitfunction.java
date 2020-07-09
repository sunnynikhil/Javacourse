/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;
import java.util.Arrays;
import java.io.*;
import java.text.*;
import java.lang.*;
/**
 *
 * @author oyo
 */
public class Splitfunction {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input= new String();
        input=in.nextLine();
        StringTokenizer st = new StringTokenizer(input,"!,?._'@ "); 
        System.out.println(st.countTokens());
        while (st.hasMoreTokens())
        { 
            System.out.println(st.nextToken()); 
        }
        
        
    }

   
}
