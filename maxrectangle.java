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
import java.util.Stack;
public class maxrectangle {
    public static int maxHist(int r,int c,int a[]){
    
        int maxarea=0,area=0,top=0;
        Stack<Integer> s = new Stack<>();
        int i=0;
        while(i<c){
            if(!s.empty())top=s.peek();
            if(s.empty()||a[(int)top]<=a[(int)i])
                s.push(i++);
            else
            {
                top=s.peek();
                s.pop();
                area=top*i;
                if(s.empty()==false)
                    area=top*(i-s.peek()-1);
                maxarea=Math.max(area, maxarea);
            }
        }
            while(!s.empty()){
                top=s.peek();
                s.pop();
                area=top*i;
                if(s.empty()==false)
                    area=top*(i-s.peek()-1);
                maxarea=Math.max(area, maxarea);
            }
            
        
        return maxarea;
    }
    public static int maxRectangle(int r,int c,int a[][]){
        int result = maxHist(r,c,a[0]);
        for(int i=1;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1)
                   a[i][j]+=a[i-1][j];
            }
            result = Math.max(result, maxHist(r,c,a[i]));
        }
        return result;
    }
    public static void main(String[] args) 
    { 
        int R = 1; 
        int C = 1; 
  
        int A[][] = { 
            { 1 } 
        }; 
        System.out.print("Area of maximum rectangle is " + maxRectangle(R, C, A)); 
    } 
}
