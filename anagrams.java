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
public class anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] Hash = new int[26];
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0;i<26;i++)
        {
            Hash[i]=0;
        }
        for(int i=0;i<a.length();i++)
        {
            Hash[a.charAt(i)-97]++;
        }
        for(int i=0;i<b.length();i++)
        {
            Hash[b.charAt(i)-97]--;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
          
            if(Hash[i]!=0)
                count=1;
                        
        }
          if(count==0)
              return true;
          else
              return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}
