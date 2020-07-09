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
public class substring {
    
    static final int MAX_CHARS = 256; 
    
    public static String findSubstring(String s){
        int n = s.length();
        boolean vist[] = new boolean[256];
        Arrays.fill(vist, false);
        int dist_count =0;
        for(int i=0;i<n;i++)
        {
            if(vist[s.charAt(i)]==false)
            {
                vist[s.charAt(i)]=true;
                dist_count++;
            }
        }
        int start =0 , start_index = -1,count=0;
        int[] cur_count = new int[256];
        int min_len = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            cur_count[s.charAt(j)]++;
            if(cur_count[s.charAt(j)]==1)
                count++;
            
            if(count==dist_count){
                while(cur_count[s.charAt(start)]>1){
                    if(cur_count[s.charAt(start)]>1)
                        cur_count[s.charAt(start)]--;
                start++;
                }
                int len_window = j - start + 1; 
                if (min_len > len_window) { 
                    min_len = len_window; 
                    start_index = start; 
                } 
            }
            
        }
        return s.substring(start_index, start_index+min_len);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(findSubstring(s));
    }
}
