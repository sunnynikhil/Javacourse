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
public class setbits {
    public static int getFirstSetBitPos(int n) 
    { 
        return (int)((Math.log10(n & -n)) / Math.log10(2)) +1; 
    } 
   
    public static String dectobi(int n){
        int bi[] = new int[100];
        int i=0;
        while(n>0){
            bi[i++]=n%2;
            n=n/2;
        }
        String b="";
        for(int j=i-1;j>=0;j--){
            b+=bi[j];
        }
        System.out.println("b=="+b);
        return b;
    }
    
    public static void left_rightcount(String b){
       int left=-1,right=-1,total=0;
       for(int i=0;i<b.length();i++)
           if(b.charAt(i)=='1')
           {
               left=i;
               break;
           }
        for(int i=b.length()-1;i>=0;i--)
            if(b.charAt(i)=='1')
           {
               right=i;
               break;
           }
        
        System.out.print("left:"+(left+1)+" right:"+(b.length()-right));
    }
   
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        String bi=dectobi(n);
        left_rightcount(bi);
    } 
}
