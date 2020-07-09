/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.longestropes.longropes;

/**
 *
 * @author oyo
 */
public class removeduplicatesfromarray {
    public static int removeduplicates(int a[],int n){
        int b[] = new int[n];
        int i=0,j=0,k=0;
        while(i<n-1){
            if(a[i]==a[i+1])
                i++;
            else
            {
                b[k++]=a[i];
                i++;
            }
        }
        b[k++]=a[n-1];
        for(int x=0;x<k;x++)
            a[x]=b[x];
        return k;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]= in.nextInt();
       n= removeduplicates(a,n);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
