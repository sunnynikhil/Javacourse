/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.setorbit.converted;

/**
 *
 * @author oyo
 */
public class countbits {
    public static int converted(int n){
        int bits=0;
        for(int i=1;i<=n;i++)
            bits+=countbitsutil(i);
        return bits;
    }
    public static int countbitsutil(int n)
    {
        if(n<=0)
            return 0;
        return (n%2==0?0:1)+countbitsutil(n/2);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int bit = converted(n);
        System.out.print(bit);
    }
}
