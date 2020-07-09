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
public class minplatforms {
    public static int minimumplotform(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=1,j=0,ploform=1,result=1;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j])
            {
                ploform++;
                i++;
            }
            else if(a[i]>b[j])
            {
                ploform--;
                j++;
            }
            result=Math.max(result, ploform);
        }
        return result;
        
    }
    public static int minimumplotformmap(int a[],int d[],int n){
        int platform[] = new int[2361]; 
    int requiredPlatform = 1; 
    for (int i = 0; i < n; i++) { 

        ++platform[a[i]];  
  
        --platform[d[i] + 1]; 
    } 
  

    for (int i = 1; i < 2361; i++) { 
 
        platform[i] = platform[i] + platform[i - 1];  
        requiredPlatform = Math.max(requiredPlatform, platform[i]); 
    } 
    return requiredPlatform; 
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arv[] = new int[n];
        int dep[] = new int[n];
        for(int i=0;i<n;i++)
            arv[i]= in.nextInt();
        for(int i=0;i<n;i++)
            dep[i]=in.nextInt();
        System.out.print("minimumu platforms required : "+minimumplotformmap(arv,dep,n));
    }
}
