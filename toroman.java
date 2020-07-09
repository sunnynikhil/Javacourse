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
public class toroman {
    
    public static String toroman(int n){
        String m[] = {"","M","MM","MMM"};
        String c[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String x[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String i[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String thousands = m[n/1000];
        String hundereds = c[(n%1000)/100];
        String ten = x[(n%100)/10];
        String one = i[n%10];
        return thousands+hundereds+ten+one;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n =in.nextInt();
            System.out.println(toroman(n));
        }
    }
}
