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
public class zigzigconversion {
    public static String getZigZigString(String s,int rows)
    {
        if(s==null || "".equals(s))
            return s;
        StringBuilder result = new StringBuilder();
        int cycleLen=2*rows-2,n=s.length();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j+i<n;j+=cycleLen)
            {
                result.append(s.charAt(j+i));
                if(i!=0 && i!=rows-1&& j+cycleLen-i<n)
                    result.append(s.charAt(j+cycleLen-i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            String s = in.next();
            int numrows = in.nextInt();
            System.out.println(getZigZigString(s,numrows));
        }

    }
}
