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
public class convertstringtointeger {
    public static int myAtoi(String s)
    {
        int i=0,j=s.length()-1,result=0;
        int sign=1;
        while(i<s.length())
        {
            if(s.charAt(i)==' ')
                i++;
            else if(Character.isDigit(s.charAt(i)))
                break;
            else if(s.charAt(i)=='+')
            {
                sign=1;
                i++;
                break;
            }
            else if(s.charAt(i)=='-')
            {
                sign=-1;
                i++;
                break;
            }
            else
                return 0;      
        }
        if(i>=s.length())
            return 0;
        while(i<s.length())
        {
            int digit = s.charAt(i) - '0';
        if(digit < 0 || digit > 9) break;

        //check if total will be overflow after 10 times and add digit
        if(Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE %10 < digit)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        result = 10 * result + digit;
        i ++;
            
            
        }
        
            return result*sign;
        
     }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            String s = in.nextLine();
            System.out.println(myAtoi(s));
            
        }
    }
    
}
