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

public class removenumberofcharacters {
 
    public static int remove(String s){
        Map<Character,Integer> map = new HashMap<>();
        int odd =0;
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(Integer it : map.values()){
            if(it%2!=0)
                odd++;
        }
        if(odd==0)
            return 0;
        return odd-1;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count =remove(s);
        System.out.print(count);
    }
}
