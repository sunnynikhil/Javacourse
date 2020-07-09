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
public class longestsubting {
    private static int NOOFCHARS = 256;
    public static int longeststring(String s){
        
        int n = s.length();
         if (n==0)
             return 0;
        int cur_len=1;
        int max_len =1;
        int prev;
        int vist[] = new int[256];
        for(int i=0;i<NOOFCHARS;i++)
            vist[i]=-1;
        vist[s.charAt(0)]=0;
        for(int i=1;i<n;i++){
            prev=vist[s.charAt(i)];
            if(prev==-1 || i-prev>cur_len)
                cur_len++;
            else{
                if(cur_len>max_len)
                    max_len=cur_len;
                cur_len=i-prev;
            }
            vist[s.charAt(i)]=i;
        }
        if(cur_len>max_len)
            max_len=cur_len;
        return max_len;
    }
    public static void main(String[] args){
        String s = "ABDEFGABEF";
        int n=longeststring(s);
        System.out.print("lenght="+n);
    }
}
