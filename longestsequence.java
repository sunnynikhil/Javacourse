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

public class longestsequence {

    public static void longestsub(String s , int k){
    
        int dp[] = new int[s.length()];
        int max_length[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            int cur = s.charAt(i)-'a';
            
            int lower = Math.max(0, cur-k);
            int upper = Math.min(25,cur+k);
            
            for(int j=lower ; j<=upper ; j++){
                System.out.println("in loop dp[i+"+i+"]:"+dp[i]+" max[j"+j+"]"+max_length[j]);
                dp[i]=Math.max(dp[i], max_length[j]+1);
            }
            max_length[cur]=Math.max(dp[i], max_length[cur]);
        }
        int ans =0;
        for(int i:dp) ans = Math.max(i, ans);
        
        System.out.print(ans);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        longestsub(s,k);
    }
    
}
