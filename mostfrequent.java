/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
import java.util.Map.Entry;
public class mostfrequent {
    public static char frequentletter(String s){
        TreeMap<Character,Integer> hash = new TreeMap<>();
        int max=-1;
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i)))
            {
                hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
                
            }
            else
            {
                hash.put(s.charAt(i), 1);
            }
            if(max<hash.get(s.charAt(i)))
                max=hash.get(s.charAt(i));
        }
        for(Entry<Character ,Integer> entry: hash.entrySet()){
            if(entry.getValue()==max)
                return entry.getKey();
        }
        return 'c';
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(frequentletter(s));
    }
}
