/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;
import static javacourse.strstr.strstr;

/**
 *
 * @author oyo
 */
public class anagram {
    public static boolean anagram(String a,String b)
    {
        if (a.length()!=b.length())
            return false;
        HashSet<Character> set = new HashSet<>();
        set.contains(b)
        Hashtable<Character,Integer> hash = new Hashtable<>();
        for(int i=0;i<a.length();i++)
        {
            if(hash.containsKey(a.charAt(i)))
                hash.put(a.charAt(i),hash.get(a.charAt(i))+1);
            else
                hash.put(a.charAt(i), 1);
        }  
        
        for(int i=0;i<b.length();i++)
        {
            if(hash.containsKey(b.charAt(i)))
                hash.put(b.charAt(i),hash.get(b.charAt(i))-1);
            else
                hash.put(b.charAt(i), 1);
        }
                
        for(Entry<Character,Integer> entry : hash.entrySet()){
            if(entry.getValue()!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.print(anagram(a,b));
    }
}
