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
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
 class ToyFreq {
       int mentioned;
	int quoted ;
     ToyFreq(int m,int q){
        this.mentioned=m;
        this.quoted=q;
     }
     int getquoted(){
         return this.quoted;
     }
     int getmetioned(){
         return this.mentioned;
     }
}
public class TopToys {
    
    
    public static void buzzwords(int numtoys,int toptoys,String[] toys,int numquotes, String[] quotes){
        
        Map<String, ToyFreq> map = new HashMap<>();
        
        for(String toy : toys){
            map.put(toy,new ToyFreq(0,0));     
        }        
        for(String line : quotes){
           line = line.toLowerCase();
           
           String[] words = line.split("\\s+");
           for(int i=0;i<words.length;i++)
               words[i] = words[i].replaceAll("[^\\w]", "");
           Map<String,Integer> quoted = new HashMap<String,Integer>();
           for(int i=0;i<words.length;i++){
               if(map.containsKey(words[i])){
                   ToyFreq inner = map.get(words[i]);
                   inner.mentioned++;
                   if(quoted.containsKey(words[i])==false)
               {
                   quoted.put(words[i], 1);
                   inner.quoted++; 
               }
               }
           }   
        } 
        for(String toy : toys){
            ToyFreq a = map.get(toy);
            if(a.quoted>=2)
                 System.out.println("toy:"+toy+" mentioned"+a.getmetioned()+" quoted"+a.getquoted());
        }
        
        
    }
    
    public static void main(String[] args){
     
        String[] quotes = new String[]
    
        {
			"Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
			"The new Elmo dolls are super high quality",
			"Expect the Elsa dolls to be very popular this year, Elsa!",
			"Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
			"For parents of older kids, look into buying them a drone",
			"Warcraft is slowly rising in popularity ahead of the holiday season"
        };
		
		String[] toys = new String[]{
            "elmo", "elsa", "legos", "drone", "tablet", "warcraft"
                };
                
                int numtoys=5;
                int toptoys =2;
                int numquotes = 6;
                buzzwords(numtoys,toptoys,toys,numquotes,quotes);
    }
}
