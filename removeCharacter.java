/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class removeCharacter {
    
    public static String removeCharacter(String a,String b)
     {
         HashSet<Character> set = new HashSet<>();
         for(int i=0;i<b.length();i++)
         {
             if(!set.contains(b.charAt(i)))
                 set.add(b.charAt(i));
         }
         String res="";
         for(int i=0;i<a.length();i++)
         {
             if(!set.contains(a.charAt(i)))
                 res+=a.charAt(i);
         }
         return res;
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String s1 = in.next();
	 String s2 = in.next();
	 System.out.println(removeCharacter(s1,s2));
	 
	 }
	 }
}
