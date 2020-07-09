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
import java.util.Map.Entry;
public class relativesorting {
    public static void relativesort(int a[],int b[],int n,int m){
        Arrays.sort(a);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
                map.put(a[i], map.get(a[i])+1);
            else
                map.put(a[i], 1);
        
        }
        HashSet<Integer> h1 = new HashSet<>();
        HashMap<Integer,Integer> h2 = new HashMap<>();
        for(int i=0;i<m;i++)
            h1.add(b[i]);
        for(int i=0;i<n;i++)
        {
            if(!h1.contains(a[i]))
            {
                if(h2.containsKey(a[i]))
                    h2.put(a[i], h2.get(a[i])+1);
                else
                    h2.put(a[i], 1);
            }
        }
        int res[] = new int[n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            if(map.containsKey(b[i]))
            {int count = map.get(b[i]);
            for(int j=0;j<count;j++)
                res[k++]=b[i];
            }
        }
        
        for(Entry<Integer,Integer> entry : h2.entrySet())
        {
            int value = entry.getValue();
            int key = entry.getKey();
            for(int i=0;i<value;i++)
                res[k++]=key;
        }
        for(int i=0;i<n;i++)
            System.out.print(res[i]+" ");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int a[] = new int[n1];
        int b[] = new int[n2];
        for(int i=0;i<n1;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n2;i++)
            b[i]=in.nextInt();
        relativesort(a,b,n1,n2);
    }
    
}
