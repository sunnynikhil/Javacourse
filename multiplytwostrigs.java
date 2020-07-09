/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.roattionofstring.arerotations;

/**
 *
 * @author oyo
 */
public class multiplytwostrigs {
    public static String multiply(String s1,String s2){
         if ((s1.charAt(0) == '-' || s2.charAt(0) == '-') &&  
        (s1.charAt(0) != '-' || s2.charAt(0) != '-')) 
        System.out.print("-"); 
  
    if (s1.charAt(0) == '-' &&  
        s2.charAt(0) != '-')  
    { 
        s1 = s1.substring(1); 
    }  
    else if (s1.charAt(0) != '-' &&  
             s2.charAt(0) == '-') 
    { 
        s2 = s2.substring(1); 
    }  
    else if (s1.charAt(0) == '-' &&  
             s2.charAt(0) == '-') 
    { 
        s1 = s1.substring(1); 
        s2 = s2.substring(1); 
    } 
        
        
        
        int len1 = s1.length();
        int len2 = s2.length();
        int res[] = new int[len1+len2];
        int i_s1=0,i_s2=0;
         int carry=0;
        for(int i=len1-1;i>=0;i--){
           
            int n1 = s1.charAt(i)-'0';
            i_s2=0;
            for(int j=len2-1;j>=0;j--)
            {
                int n2 = s2.charAt(j)-'0';
                int sum=n1*n2+res[i_s1+i_s2]+carry;
                carry=sum/10;
                res[i_s1+i_s2]=sum%10;
                i_s2++;
            }
            if(carry>0)
                res[i_s1+i_s2]+=carry;
           i_s1++;
        }
        int i=res.length-1;
        while(i>=0 && res[i]==0)
            i--;
        if(i==-1)
            return "";
        String ans ="";
        while(i>=0)
            ans+=res[i--];
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.print(multiply(a,b));
    }
}
