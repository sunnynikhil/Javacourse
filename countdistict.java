/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import static javacourse.nonrepeatingelements.nonrepating;

/**
 *
 * @author oyo
 */
public class countdistict {
    public static void countdistict(int a[],int k,int n){
        HashMap<Integer,Integer> hash = new HashMap<>();
        int count=0;
        for(int i=0;i<k;i++){
            if(!hash.containsKey(a[i]))
            {hash.put(a[i],1);
            count++;
            }
            else
                hash.put(a[i],hash.get(a[i])+1);
        }
        System.out.print(count+" ");
        for(int i=k;i<n;i++){
            if(hash.get(a[i-k])==1)
            {
                hash.remove(a[i-k]);
                count--;
                
            }
            else
            {
                hash.put(a[i-k], hash.get(a[i-k])-1);
            }
            
            if(!hash.containsKey(a[i]))
            {hash.put(a[i],1);
            count++;
            }
            else
                hash.put(a[i],hash.get(a[i])+1);
            System.out.print(count+" ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int k = in.nextInt();
        countdistict(a,k,n);
    }
    
}
