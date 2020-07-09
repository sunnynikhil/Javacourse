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
import java.util.ArrayList;
import javafx.util.Pair;
import java.util.Comparator;
import static javacourse.mergesort.mergesort;
public class mininswaps {
    
    public static int miniswaps(int a[]){
        int n= a.length;
        int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++)
		{
			b[i] = a[i];
			c[i] = i;
		}
	 for(int i=0; i < n; i++){  
           for(int j=1; j < (n-i); j++){  
               if(b[j-1] > b[j]){ 
                  int temp = b[j-1];  
                  b[j-1] = b[j];  
                  b[j] = temp;
				  temp = c[j-1];
				  c[j-1] = c[j];
				  c[j] = temp;
               }                     
            }  
         }
        int ans=0;
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        
        for(int i=0;i<n;i++){
            if(vis[i]||c[i]==i)
                continue;
            
            int cycle=0;
            int j=i;
            while(!vis[j]){
                vis[j]=true;
                j=c[j];
                cycle++;
            }
            if(cycle>0)
            {
                ans+=cycle-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(miniswaps(a));
    }
}
