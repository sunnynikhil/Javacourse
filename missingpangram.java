/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import static javacourse.mostfrequent.frequentletter;

/**
 *
 * @author oyo
 */
public class missingpangram {
    public static String missingcharacters(String s){
        HashSet<Character> hash = new HashSet<>();
        s=s.toLowerCase();
        String check = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<26;i++)
            hash.add(check.charAt(i));
        for(int i=0;i<s.length();i++)
            if(hash.contains(s.charAt(i)))
                hash.remove(s.charAt(i));
        String res="";
        Iterator<Character> it = hash.iterator();
        while(it.hasNext())
        {
            res+=it.next();
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(missingcharacters(s));
    }
}
