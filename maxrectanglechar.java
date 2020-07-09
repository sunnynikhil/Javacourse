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
public class maxrectanglechar {
    public static int maxHist(int r,int c,char a[]){
    
        int maxarea=0,area=0,top=0;
        java.util.Stack<Integer> s = new java.util.Stack<>();
        int i=0;
        while(i<c){
            if(!s.empty())top=s.peek();
            if(s.empty()||Character.forDigit(a[(int)top],10)<=Character.forDigit(a[(int)i],10))
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
    public static int maxRectangle(char a[][]){
        int r=a.length,c=a[0].length;
        int result = maxHist(r,c,a[0]);
        for(int i=1;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1)
                   a[i][j]= (char) (Character.forDigit(a[i][j],10)+Character.forDigit(a[i-1][j],10));
            }
            result = Math.max(result, maxHist(r,c,a[i]));
        }
        return result;
    }
    public static void main(String[] args) 
    { 
        int R = 4; 
        int C = 4; 
  
        int A[][] = { 
            { 0, 1, 1, 0 }, 
            { 1, 1, 1, 1 }, 
            { 1, 1, 1, 1 }, 
            { 1, 1, 0, 0 }, 
        }; 
        System.out.print("Area of maximum rectangle is " + maxRectangle(R, C, A)); 
    } 
}
