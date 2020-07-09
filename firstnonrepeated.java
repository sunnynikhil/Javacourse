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
public class firstnonrepeated {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String stream = in.nextLine();
        firstnonrepeating(stream);
    }

    private static void firstnonrepeating(String input) {
        List<Character> queue = new ArrayList<Character>();
        
        boolean repeated[]= new boolean[256];
        for(int i=0;i<input.length();i++)
        {
            char c = input.charAt(i);
            if(!repeated[c]){
                if(!queue.contains(c))
                    queue.add(c);
                else
                {
                    queue.remove((Character)c);
                    repeated[c]=true;
                }
            }
            if(queue.size()>0)
            {
                System.out.println(queue.get(0));
            }
        }
        
    }
}
