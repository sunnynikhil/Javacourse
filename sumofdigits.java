/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;
/**
 *
 * @author oyo
 */
public class sumofdigits {
    public static int digitsum(int input)
    {
        int sum=0;
        int r=0;
        while(input>0)
        {
            r=input%10;
            sum=(sum*10)+r;
            input=input/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       int input=in.nextInt();
       int sum=digitsum(input);
       System.out.print(sum);
    }
    
}
