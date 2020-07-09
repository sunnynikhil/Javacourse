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
public class reminder7 {
    public static int reminder7(String num){
        int s[] = {1,3,2,-1,-3,-2};
        int s_i=0;
        int res=0;
        for(int i=num.length()-1;i>=0;i--)
        {
            int digit = num.charAt(i)-'0';
            res += digit*s[s_i];
            s_i=(s_i)%6;
            res %=7;
        }
        if(res<0)
            res= (res+7)%7;
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(reminder7(s));
    }
}
