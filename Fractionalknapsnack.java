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
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
public class Fractionalknapsnack {
    public static double knapsanck(int n, Item a[],int w)
    {
        double totalval= 0d;
        Arrays.sort(a, new Comparator<Item>(){

            @Override
            public int compare(Item o1, Item o2) {
                return (int)((o2.value/o2.weight)-(o1.value/o1.weight)); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        int curwt=0;
        for(int i=0;i<n;i++)
        {
            if(curwt+a[i].weight<=w)
            {
                totalval=totalval+a[i].value;
                curwt+=a[i].weight;
            }
            else
            {
                int r = w-curwt;
                totalval+=a[i].value*((double)r/a[i].weight);
                break;
            }
        }
        return totalval;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        Item[] a= new Item[n];
        for(int i=0;i<n;i++)
        {
            int val = in.nextInt();
            int wt  = in.nextInt();
            a[i]=new Item(val,wt);
        }
        System.out.print(knapsanck(n,a,w));
    }
}
