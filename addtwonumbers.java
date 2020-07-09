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
public class addtwonumbers {
    public static int addsum(int a,int b){
        while(b!=0){
            int carry = a&b;
            System.out.println("carry:"+carry);
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print(addsum(a,b));
    }
}
