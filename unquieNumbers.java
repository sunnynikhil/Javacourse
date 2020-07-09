/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 *
 * @author oyo
 */
public class unquieNumbers {
    
     public static int fun(int i){
        String a1=Integer.toString(i);
        char[] a=a1.toCharArray();
        TreeSet<Character> ts=new TreeSet<>();
        for(int k=0;k<a.length;k++){
            if(!ts.contains(a[k]))
                ts.add(a[k]);
            else
                return 0;
        }
        return 1;
    }
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t!=0){
		    String w=br.readLine();
		    String[] w1=w.split(" ");
		    int a=Integer.parseInt(w1[0]);
		    int b=Integer.parseInt(w1[1]);
		    for(int i=a;i<=b;i++){
		        int f=fun(i);
		        if(f==1)
		            System.out.print(i+" ");
		    }
		    System.out.println();
		    t--;
		}
	}
}
