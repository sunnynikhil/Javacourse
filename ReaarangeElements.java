/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author oyo
 */

public class ReaarangeElements {
    static class key{
        int val;
        char ch;
        key(int val,char ch)
        {
            this.val=val;
            this.ch=ch;
        }
    } 
    static class keyCompartor implements Comparator<key>{

        @Override
        public int compare(key o1, key o2) {
            if(o1.val<o2.val)
                return 1;
            else if (o1.val>o2.val)
                return -1;
            else
                return 0;
        }
    
} 
    public static boolean rearrangeElements(String s )
    {
        int count[] = new int[26];
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)-'a']++;
        PriorityQueue<key> pq = new PriorityQueue<>(new keyCompartor());
        for(char c = 'a';c<='z';c++)
        {
            int val = c-'a';
            if(count[val]>0)
                pq.add(new key(count[val],c));
            
        }
        String res ="";
        key prev = new key(-1,'#');
        while(pq.size()!=0)
        {
            key k = pq.peek();
            pq.poll();
            res+=k.ch;
            if(prev.val>0)
                pq.add(prev);
            k.val--;
            prev=k;
                
        }
        System.out.println("string:"+res);
            return s.length()==res.length();
        
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	   String s = in.next();
	   if(rearrangeElements(s))
               System.out.println("1");
           else
               System.out.println("0");
	 }
	 }

    
    
}
