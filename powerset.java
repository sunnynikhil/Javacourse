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
public class powerset {
    public static void powersetutil(String str , int i ,String cur ,ArrayList<String> res){
        int n= str.length();
        if(i==n)
            return;
        res.add(cur);
        for(int j=i+1;j<n;j++)
        {
            cur+=str.charAt(j);
            powersetutil(str,j,cur,res);
            cur=cur.substring(0,cur.length()-1);
            Integer.MIN_VALUE
        }
    }
    public static ArrayList<String> powerset(String s){
        int index=-1;
        String cur="";
        ArrayList<String> res = new ArrayList<>();
        powersetutil(s,index,cur,res);
        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ArrayList<String> result = powerset(s);
        for(String str: result)
            System.out.print(str+" ");
    }
}
