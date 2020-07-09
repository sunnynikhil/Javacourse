/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author oyo
 */
public class java_substring {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        StringBuffer out=new StringBuffer();
        for(int i=0;i<S.length();i++)
        {
            if(i>=start && i<end)
                out.append(S.charAt(i));
        }
        S=out.toString();
        System.out.println(S);
        
    }
    
}
