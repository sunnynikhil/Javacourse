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
public class removepail {
    
    public static int removeP(String s){
        Map<Character,Integer> map = new HashMap<>();
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
                
        }
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry val = (Map.Entry)it.next();
            if((Integer)val.getValue()%2!=0){
                result++;
            }
            
                    
        }
        if(result==0)
            return result;
        return result-1;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = removeP(s);
        System.out.print(count);
    }
}
