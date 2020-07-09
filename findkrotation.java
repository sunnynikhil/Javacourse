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
public class findkrotation {
    
    public static int findk(int a[]){
        int result = 1;
        int i=0,j=1;
        while(i<a.length&& j<a.length){
            if(a[i]<a[j])
            {
                i++;
                j++;
                result++;
            }
            else
                break;
        }
        if(result==a.length)
            return 0;
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int k = findk(a);
        System.out.print("k:"+k);
    }
}
