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
public class noofBST {
    public static int bimonal(int n,int k){
        int res=1;
        if(k>n-k)
            k=n-k;
        for(int i=0;i<k;++i)
        {
            res  = res* (n-i);
            res = res/ (i+1);
        }
        return res;
    }
    public static int countBST(int n){
        int c = bimonal(2*n,n);
        return c/(n+1);
    }
    public static int countbst(int n)
            
    {
        
        int d = (factioral(2*n))/((factioral(n+1))*factioral(n));
        return d;
    }
    public static int factioral(int n)
    {
        if(n==1)
            return 1;
        return n*factioral(n-1);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(countBST(n));
    }
}
