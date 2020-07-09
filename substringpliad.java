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
public class substringpliad {
    
    public static int subpliad(String s){
        int n=s.length();
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<=n;j++){
                String sub =s.substring(i, j);
                if(ispail(sub) && sub != "")
                {
                    set.add(sub);
                }
            }
            
        }
        for(String a :set){
            System.out.println(a);
        }
        return set.size()-1;
    }
    
    public static boolean ispail(String s){
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=s.charAt(s.length()-1-i))
               return false;
       }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int n=subpliad(s);
        System.out.print(n);
    }
    
}
