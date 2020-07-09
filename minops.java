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
public class minops {
    public static int minops(String a , String b){
        if(a.length()!=b.length())
            return -1;
        int count[] = new int[256];
        for(int i=0;i<a.length();i++)
        {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
            
        }
        for(int i=0;i<256;i++)
            if(count[i]!=0)
                return -1;
        
        int i,j,res=0;
        i=a.length()-1;
        j=b.length()-1;
        while(i>=0){
            if(a.charAt(i)!=b.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.print(minops(s1,s2));
    }
}
