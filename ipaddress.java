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
public class ipaddress {
    public static boolean isVaild(String s){
       String [] a;
    	int n;
    	a = s.split("\\.");
        if(s.charAt(s.length()-1)=='.')
            return false;
            
        System.out.print(a.length);
        if(a.length != 4)
        	return false;
        for(int i=0;i<4;i++)
        {
        	try
        	{
            	n = Integer.parseInt(a[i]);
            	if ( 0 > n || n > 255)
            		return false;
                String t = a[i].toString();
                if(t.charAt(0)=='0' && t.length()>1)
                    return false;		
        	}catch (Exception e) {
				return false;
			}
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(isVaild(s));
    }
}
