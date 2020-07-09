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
public class rotatemartix90 {
    
    public static void rotate(int a[][] , int n){
       for(int x=0;x<n/2;x++)
       {
           for(int y=x;y<n-1-x;y++){
//               System.out.print("x="+x+" y="+y);
           int temp = a[x][y];
           a[x][y]=a[y][n-1-x];
           a[y][n-1-x]=a[n-1-x][n-1-y];
           a[n-1-x][n-1-y]=a[n-1-y][x];
           a[n-1-y][x]=temp;
           
       }
       }
    }
    public static void displaymat(int a[][] , int n){
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
            { System.out.print(a[i][j]+" ");
            
            }
        System.out.println();
        }
    }
    public static void reversecloums(int a[][],int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0,k=n-1;j<k;j++,k--)
            {
                int temp = a[j][i];
                a[j][i]=a[k][i];
                a[k][i]=temp;
            }
        }
    }
    public static int[][] transpose(int a[][], int n){
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int [n][n];
        for(int i=0;i<n;i++)
            for(int j =0 ;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        System.out.println();
        a=transpose(a,n);
        displaymat(a,n);
        System.out.println();
        reversecloums(a,n);
        displaymat(a,n);
    } 
}
