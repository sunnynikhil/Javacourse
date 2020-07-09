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
class interval{
        int buy,sell;
    }
public class stockmarket {
    
    public static void maxprofit(int a[]){
        int count=0;
        int i=0;
        
        int n=a.length;
        if(n==1)
            return ;
        ArrayList<interval> sol = new ArrayList();
        while(i<n-1){
            
            while(i<n-1 && a[i+1]<=a[i])
                i++;
            if(i==n-1)
                break;
            interval e = new interval();
            e.buy=i++;
            
            while(i<n && a[i]>=a[i-1])
                i++;
            e.sell=i-1;
            count++;
            sol.add(e);
            
        }
        if(count==0)
            System.out.print("No profit");
        else
        {
            for(int j =0;j<count;j++)
                System.out.append("buy on day "+sol.get(j).buy+",sell on day :"+sol.get(j).sell);
        }
            
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        maxprofit(a);
    }
}
