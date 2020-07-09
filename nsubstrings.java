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
public class nsubstrings {
    public static int numofpald(String s){
        TreeMap<String ,Integer> map = new TreeMap<>();
        int n = s.length();
        int r[][] = new int[2][n+1];
        s='@'+s+'#';
        for(int j=0;j<=1;j++)
        {
            int rp=0;
            r[j][0]=0;
            int i=1;
            while(i<=n){
                
            }
            
        }
        
        return map.size();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = numofpald(s);
        System.out.print(count);
    } 
}
