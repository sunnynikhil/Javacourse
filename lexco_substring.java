/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;

/**
 *
 * @author oyo
 */
public class lexco_substring {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzzzzzzzz";
        String largest = "";
        String startword;
        for(int i=0;i<s.length()-(k-1);i++)
        {   
            startword=s.substring(i,i+k);
            if(startword.compareTo(largest)>0)
                largest=startword;
            if(startword.compareTo(smallest)<0)
            {
                smallest=startword;
            }                
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
    
}
