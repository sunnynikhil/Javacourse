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
public class squareroot {
    
    public static long squarerootof(int n){
        return (long)Math.floor(Math.sqrt(n));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            System.out.println("square root:"+squarerootof(n));
        }
    }
    
}
