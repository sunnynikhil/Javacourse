/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.io.*;
import java.util.*;

/**
 *
 * @author oyo
 */

public class Stack {
    public static int getmin(int[] array)
    {
      
        Stack stack = new Stack();
        stack.push();
        
        
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i]=in.nextInt();
        System.out.print(getmin(array));
  
    }
    
}
