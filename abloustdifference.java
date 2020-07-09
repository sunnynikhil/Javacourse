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
public class abloustdifference {
    public static int finddifference(int a[]){
        int rs=0,ls=0;
        int i=0;
        Arrays.sort(a);
        
        while(i<a.length)
        {
            System.out.print("first="+a[i]+" second"+a[i+1]);
            System.out.println();
        if(rs>ls)
        {
            ls=ls+a[i+1];
           rs=rs+a[i]; 
        }
        else
        {
            rs=rs+a[i+1];
            ls=ls+a[i];
            
        }
        i=i+2;
            }
        return rs>ls?rs-ls:ls-rs;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int diffference = finddifference(a);
        System.out.print(diffference);
    }
}
