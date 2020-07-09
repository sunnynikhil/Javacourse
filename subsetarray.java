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
public class subsetarray {
    
    public static boolean is_subset(int a[],int b[])
    {
        boolean flag=true;
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0;i<b.length;i++)
            if(s.contains(b[i])==false)
                s.add(b[i]);
        for(int i=0;i<a.length;i++)
            if(s.contains(a[i])==false)
                return flag=false;
            else
                flag=true;
        return flag;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int a1[] = new int[n1];
        for(int i=0;i<n1;i++)
            a1[i]=in.nextInt();
        int n2 = in.nextInt();
        int a2[] = new int[n2];
        for(int i=0;i<n2;i++)
            a2[i]=in.nextInt();
        boolean is_subset=is_subset(a1,a2);
        if(is_subset)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
