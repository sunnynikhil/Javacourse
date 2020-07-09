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
public class th4pointer {
    public static double area(int x1,int y1,int x2 , int y2,int x3 ,int y3 ){
        return Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
    }
    public static boolean inside(int x1,int y1,int x2,int y2,int x3, int y3 ,int x,int y){

       double  a = area(x1,y1,x2,y2,x3,y3);
       double a1 = area(x,y,x2,y2,x3,y3);
       double a2 = area(x1,y1,x,y,x3,y3);
       double a3 = area(x1,y1,x2,y2,x,y);
       System.out.print("a="+a+",a1="+a1+",a2="+a2+",a3="+a3);
       
       return (a==a1+a2+a3);
       
        
}
    public static void main(String[] args){
       if(inside(0, 0, 20, 0, 10, 30, 10, 25))
           System.out.println("Inside");
       else
           System.out.print("outside");
        
    }
}
