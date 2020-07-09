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

public class nstair {
    public static int nstair(int n){
        if(n<=1)
            return n;
        return nstair(n-1)+nstair(n-2);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = nstair(n+1);
        System.out.print(ans);
    }
}
