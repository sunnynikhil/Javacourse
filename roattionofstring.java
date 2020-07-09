/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;
import static javacourse.anagram.anagram;

/**
 *
 * @author oyo
 */
public class roattionofstring {
    static int size=256;
    public static boolean arerotations(String a, String b){
        int n = a.length();
        int m = b.length();
        if(n!=m)
            return false;
        boolean[] marked = new boolean[size];
        Arrays.fill(marked, false);
        int[] map = new int[size];
        Arrays.fill(map,-1);
        for(int i=0;i<n;i++)
        {
            if(map[a.charAt(i)]==-1)
            {
                if(marked[b.charAt(i)]==true)
                   return false;
                marked[b.charAt(i)]=true;
                map[a.charAt(i)]=b.charAt(i);
                
            }
            else if(map[a.charAt(i)]!=b.charAt(i))
                return false;
        }
        return true;
    }
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.print(arerotations(a,b));
    }
}
