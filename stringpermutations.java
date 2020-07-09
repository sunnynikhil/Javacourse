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
public class stringpermutations {
    public static ArrayList<String> permutationsUtil(String s ){
        if(s.length()==0)
        {
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        char ch = s.charAt(0);
        String resStr = s.substring(1);
        ArrayList<String> preRes = permutationsUtil(resStr);
        ArrayList<String> res = new ArrayList<>();
        for(String str : preRes )
        {
            for(int i=0;i<=str.length();i++)
            {
                String f = str.substring(0,i)+ch+str.substring(i);
                  if(!present(f,res))
                      res.add(f);
                }
        }
        return res;
    }
    
    public static boolean present(String s , ArrayList<String> list){
    
        for(String str : list)
        {
            if(str.equals(s))
                return true;
        }
        return false;
    }
    
    public static void permutations(String s){
        ArrayList<String> res=permutationsUtil(s);
        Collections.sort(res);
        for(String str: res)
            System.out.print(str+" ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        permutations(s);
    }
}
