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

public class graphposition {
    public static void currentposition(String s){
        int right=0,left=0,up=0,down=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='U')
                up++;
            else if (s.charAt(i)=='L')
                left++;
            else if(s.charAt(i)=='D')
                down++;
            else if(s.charAt(i)=='R')
                right++;
        }
        System.out.print("final position ("+(right-left)+","+(up-down)+")");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        currentposition(s);
    }
}
