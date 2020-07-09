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
public class largestsum {
    public static String findnumber(int n , int sum)
    {
        if(sum==0 || sum>9*n)
            return "-1";
        String res="";
        
        for(int i=0;i<n;i++)
        {
            if(sum>9)
            { res+="9";
              sum=sum-9;
            }
            else
            {
                res+=String.valueOf(sum);
                sum=0;
            }
            
                
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum = in.nextInt();
        System.out.print(findnumber(n,sum));
    }
    
}
