/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static javacourse.countdistict.countdistict;

/**
 *
 * @author oyo
 */
public class sortfreq {
    public static void sortfreq(int a[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        StringBuffer result = new StringBuffer();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
                map.put(a[i], map.get(a[i])+1);
            else
                map.put(a[i], 1);
        }
         map.entrySet().stream() 
                .sorted(Map.Entry.<Integer, Integer> comparingByValue().reversed()) 
                .forEach(e -> { 
                    int key = e.getKey(); 
                    int val = e.getValue(); 
                    for (int i = 0; i < val; i++) { 
                        result.append(key + " "); 
                    } 
                }); 
         System.out.print(result);
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        
        sortfreq(a,n);
    }
}
