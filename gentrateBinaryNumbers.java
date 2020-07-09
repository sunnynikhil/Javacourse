/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author oyo
 */
public class gentrateBinaryNumbers {
    public static void gentrateBinary(int n)
    {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        while(n>0)
        {
            String s = queue.peek();
            queue.poll();
            System.out.print(s+" ");
            String s1 = s+"0";
            queue.add(s1);
            String s2 = s+"1";
            queue.add(s2);
            n--;
            
        }
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 gentrateBinary(n);
         System.out.println();
	 }
	 }
}
