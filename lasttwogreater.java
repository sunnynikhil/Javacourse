/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class lasttwogreater {
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 ArrayList<Integer> list = new ArrayList<>();
	 for(int i=0;i<n;i++)
	 {
	     list.add(in.nextInt());
	 }
         Collections.sort(list);
	 for(int i=0;i<n-2;i++)
	   System.out.print(list.get(i)+" ");
	 System.out.println();  
	 }
	 }
}
