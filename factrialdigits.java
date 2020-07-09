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
public class factrialdigits {
    
    
    public static int factdigit(int n){
        if(n<0)
            return 0;
        if(n==1)
            return 1;
        double digits =0;
        for(int i=2;i<=n;i++)
        {
            digits+=Math.log10(i);
        }
        
        return (int)Math.floor(digits)+1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(factdigit(n));
    }
}
