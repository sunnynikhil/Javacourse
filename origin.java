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
import java.util.Arrays;
import java.util.PriorityQueue;
public class origin {
    
    class PointDistance{
        int x,y,dist;
        PointDistance(int x, int y , int distance){
            this.x=x;
            this.y=y;
            this.dist=distance;
        }
    }
    public static int dist(int a[]){
        return a[0]*a[0]+a[1]*a[1];
    }
    class sortByDistance implements Comparator<PointDistance>{
        
//        @Override
        public int compare(PointDistance a, PointDistance b){
            return b.dist - a.dist;
        }
    }
    
    public int[][] kclosest(int a[][],int k){
        
        if(a==null)
            return new int[0][];
        PriorityQueue<PointDistance> queue = new PriorityQueue<PointDistance>(new sortByDistance());
        for(int i=0;i<a.length;i++){
            queue.add(new PointDistance(a[i][0],a[i][1],dist(a[i])));
            if(queue.size()>k)
                queue.poll();
        }
        
        int [][] ans = new int[k][2];
        int i=0;
        while(!queue.isEmpty()){
            PointDistance p = queue.poll();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
            i++;
        }
        return ans;
    }
    public void main(String[] args){
        
        int a[][]=new int[][]{ {-2,4},{0,-2},{-1,0},{3,5},{-2,-3},{3,2}
                                            };
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        kclosest(a,k);
    }    
}
