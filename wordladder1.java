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
import java.util.LinkedList;

public class wordladder1 {

    
    public static void main(String[] args){
        
        Set<String> D = new HashSet<String>();
        D.add("poon"); 
        D.add("plee"); 
        D.add("same"); 
        D.add("poie"); 
        D.add("plie"); 
        D.add("poin"); 
        D.add("plea"); 
        String start = "toon"; 
        String target = "plea";
        System.out.print("Length of shortest chain is: "
        + shortestChainLen(start, target, D)); 
    }

    private static int shortestChainLen(String start, String target, Set<String> D) {
         //To change body of generated methods, choose Tools | Templates.
        
        int level=0,wordlenght=start.length();
        if(!D.contains(target))
            return 0;
        Queue<String> q = new LinkedList<String>();
        q.add(start);
        while(!q.isEmpty()){
            ++level;
            int count = q.size();
            for(int i=0;i<count;++i){
                char[] word = q.peek().toCharArray();
                q.remove();
                for(int pos=0;pos<wordlenght;++pos)
                {
                    char org_char = word[pos];
                    for(char c= 'a' ;c<='z';c++){
                        word[pos]=c;
                        if(String.valueOf(word).equals(target))
                            return level+1;
                        if(!D.contains(String.valueOf(word)))
                            continue;
                        D.remove(String.valueOf(word));
                        q.add(String.valueOf(word));
                    }
                 word[pos]=org_char;   
                }
                
            }
        }
        return level;
    }
    
}
