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
public class Nthstair {
    public static int fib(int n,int m){
        if(n<=1)
            return n;
        int r=0;
        for(int i=1;i<=m && i<=n ;i++)
            r+=fib(n-i,m);
        return r;
    }
    public static int countstairs(int n,int m){
        return fib(n+1,m);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m = in.nextInt();
        System.out.print(countstairs(n,m));
    }
}
