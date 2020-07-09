/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */52
 
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
public class excelcolumn {
    public static String excelcol(int n){
     StringBuilder res = new StringBuilder();
     while(n>0){
         int rem = n%26;
         if(rem==0)
         {res.append("Z");
          n=(n/26)-1;
         }
         else
         {
             res.append((char)((rem-1)+'A'));
             n=n/26;
         }
             
     }
     return res.reverse().toString();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(excelcol(n));
    }
}
