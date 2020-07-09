/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author oyo
 */
public class nutsandbolts {
    public static char[] sort(char[] input)
    {
        TreeSet<Character> set = new TreeSet<>();
        for(int i=0;i<input.length;i++)
            set.add(input[i]);
        int i=0;    
        for(Character c : set)
            input[i++]=c;
        return input;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char nuts[]= new char[n];
        char blots[] = new char[n];

        int k=0;
        for(int i=0;i<n;i++)
	     {
	         String s=in.next();
	         nuts[i]=s.charAt(0);
	     }
	     for(int i=0;i<n;i++)
	     {
	         String s=in.next();
	         blots[i]=s.charAt(0);
	     }
        Arrays.sort(nuts);
        Arrays.sort(blots);
        
        for(int i=0;i<nuts.length;i++)
            System.out.print(nuts[i]+" ");
        System.out.println();
        for(int i=0;i<blots.length;i++)
            System.out.print(blots[i]+" ");
        
    }
    
}
