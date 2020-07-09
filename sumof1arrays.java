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
public class sumof1arrays {
    public static int sumof1s(int a[]){
        int i=0;
        for( i=0;i<a.length;i++)
            if(a[i]==1)
                break;
        return a.length-i;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum = sumof1s(a);
        System.out.print(sum);
    }
}
