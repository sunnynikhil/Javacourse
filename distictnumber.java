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
import java.util.HashMap;
public class distictnumber {
    
    public static void distnumber(int a[],int n,int k){
        for(int j =0;j<=n-k;j++){
            Map<Integer,Integer> map = new HashMap<>();
                for(int i =j;i<j+k;i++){
                    
                    if(map.containsKey(a[i])==false){
                        map.putIfAbsent(a[i], 1);
                    }
                    else
                    {
                        int count = map.get(a[i]);
                        map.put(a[i],count+1);
                    }

                    if(i==j+k-1){
//                        System.out.print("cfghjkhgfds");
                        for(Integer in : map.keySet()){

                            System.out.print(in+" ");
                        }
                        System.out.println();
                        map.clear();
                    }
                }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
          a[i]=in.nextInt();
        int k = in.nextInt();
        distnumber(a,n,k);
    }
}
