/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class countsubsequnece {
    public static int getNoOfSubsequeneces(String s)
    {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i), 1);
        }
        int sum=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet())
            if(entry.getValue()>1)
                sum+=entry.getValue();
        return sum+1;
            
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            String s =in.next();
            System.out.println(getNoOfSubsequeneces(s));
        }
            
    }
}
