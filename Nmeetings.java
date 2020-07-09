/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author oyo
 */
public class Nmeetings {
    static class meet{
        int start;
        int finish;
        int pos;
        meet(int s,int f,int p)
        {
            this.start=s;
            this.finish=f;
            this.pos=p;
        }
    }
    public static Vector<Integer>  Nmeetings(int s[],int f[],int n)
    {
        ArrayList<meet> m = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            m.add(new meet(s[i],f[i],i+1));
        }
        Collections.sort(m, new Comparator<meet>() {

            @Override
            public int compare(meet o1, meet o2) {
                return o1.finish-o2.finish; //To change body of generated methods, choose Tools | Templates.
            }
        });
        Vector<Integer> ans = new Vector<>();
        ans.add(m.get(0).pos);
        int time_limit = m.get(0).finish;
        for(int i=1;i<n;i++)
        {
            if(m.get(i).start>time_limit)
            {
                ans.add(m.get(i).pos);
                time_limit= m.get(i).finish;
            }
        }
        
        return ans;
    }
    public static void main (String[] args)
	 {
	
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int s[] = new int[n];
         int f[] = new int[n];
         for(int i=0;i<n;i++)
             s[i]=in.nextInt();
         for(int i=0;i<n;i++)
             f[i]=in.nextInt();
        Vector<Integer> ans = Nmeetings(s,f,n);
         for(int i=0;i<ans.size();i++)
             System.out.print(ans.get(i)+" ");
         System.out.println();
	 }
	 }
}
