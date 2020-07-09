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
import static javacourse.longestsubsequnce.longestsubsequnce;

public class longestplandorine {
    public static boolean isPalindrome(String pan){
        StringBuilder r = new StringBuilder();
        r.append(pan);
        r=r.reverse();
        if(pan.compareTo(r.toString())==0)
            return true;
        return false;
    }
    public static String longestPalindrome(String s){
        int len =s.length();
        int start=0,low,high,maxlength=0;
        
        for(int i=0;i<len;i++)
        {
            low=i-1;
            high=i;
            while(low>=0 && high<len && s.charAt(low)==s.charAt(high)){
            if(high-low+1>maxlength)
            {
                start=low;
                maxlength=high-low+1;
            }
            --low;
            ++high;
            }
            low=i-1;
            high=i+1;
            while(low>=0 && high<len && s.charAt(low)==s.charAt(high)){
            if(high-low+1>maxlength)
            {
                start=low;
                maxlength=high-low+1;
            }
            --low;
            ++high;
            }
        }
        
        System.out.print("maxlength"+maxlength+"start"+start);
        if(maxlength==0)
            return String.valueOf(s.charAt(0));
        return s.subSequence(start, start+maxlength).toString();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(longestPalindrome(s));
    }
}
