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
public class sumofarray {
    
    public static int sumofarray(int a[]){
        int n = a.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]==1)
            {
                index=i;
                break;
            }
        }
        return n-index;
    }
    
    public static void main(String[] args){
        
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int sum = sumofarray(a);
        System.out.print(sum);
        
    }
}
